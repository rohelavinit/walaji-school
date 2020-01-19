package com.balaji.school.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/user")
public class sampleController {

    @RequestMapping(value = "/vinit", method = RequestMethod.GET)
    public String findAllAreaList() throws Exception {
        return "vinit kumar rohela";
    }
}
