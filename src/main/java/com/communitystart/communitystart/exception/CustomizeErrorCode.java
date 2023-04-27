package com.communitystart.communitystart.exception;

public enum CustomizeErrorCode implements MyCustomizeErrorCode{

    QUESTION_NOT_FOUND("你找的问题不存在了，换个问题试试？");

    private String message;

    @Override
    public String getMessage() {
        return message;
    }
    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
