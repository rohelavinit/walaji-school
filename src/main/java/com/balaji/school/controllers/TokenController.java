package com.balaji.school.controllers;

import com.balaji.school.exception.HeaderException;
import com.balaji.school.model.JwtUser;
import com.balaji.school.security.JwtGenerator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RestController
@ControllerAdvice
@RequestMapping(value = "/token")
public class TokenController {
    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @ExceptionHandler(HeaderException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object processValidationError(HeaderException exception) {
        return exception.getMessage();
    }

    @RequestMapping(value = {"", "/"},method = RequestMethod.POST)
    public ResponseEntity<String> generate(@RequestHeader HttpHeaders headers) throws HeaderException,NoSuchPaddingException,InvalidAlgorithmParameterException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException{
        if(headers.containsKey("iv-user") && headers.containsKey("iv-groups")) {
            String ivUsers = headers.getValuesAsList("iv-user").get(0);
            String ivGroups = headers.getValuesAsList("iv-groups").get(0);
            JwtUser jwtUser = new JwtUser();
            jwtUser.setUserName(ivUsers);
            jwtUser.setRole(ivGroups);
            String token = jwtGenerator.generate(jwtUser);
            HttpHeaders headers1 = new HttpHeaders();
            headers1.set("token",token);
            return new ResponseEntity<String>("Authentication Successful", headers1, HttpStatus.OK);
        }
        else{
            throw new HeaderException("Please check your inputs");
        }
    }
}
