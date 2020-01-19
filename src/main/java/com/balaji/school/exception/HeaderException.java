package com.balaji.school.exception;

public class HeaderException extends Exception{

    private int errorCode;
    private String errorMessage;

    public HeaderException(String message) {
        super(message);
    }

//    public HeaderException(Throwable throwable) {
//        super(throwable);
//    }

    public HeaderException(String message, int errorCode) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = message;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
