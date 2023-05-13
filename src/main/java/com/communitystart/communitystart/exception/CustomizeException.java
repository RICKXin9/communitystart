package com.communitystart.communitystart.exception;

public class CustomizeException extends RuntimeException{
    private String message;
    private Integer code;

    @Override
    public String getMessage() {
        return message;
    }
    public CustomizeException(CustomizeErrorCode customizeErrorCode) {
        this.message = customizeErrorCode.getMessage();
        this.code = customizeErrorCode.getCode();
    }
    public Integer getCode() {
        return code;
    }


}
