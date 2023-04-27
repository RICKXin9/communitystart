package com.communitystart.communitystart.exception;

public class CustomizeException extends RuntimeException{
    private String message;
    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public CustomizeException(MyCustomizeErrorCode customizeErrorCode) {
        this.message = customizeErrorCode.getMessage();
    }
}
