package com.communitystart.communitystart.exception;

public enum CustomizeErrorCode implements MyCustomizeErrorCode{

    QUESTION_NOT_FOUND(2001,"你找的问题不存在了，换个问题试试？"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何问题或评论进行回复"),
    NO_LOGIN(2003, "当前操作需要登录，请登录后重试"),
    SYS_ERROR(2004, "服务器被干烂了，请稍后再试"),
    COMMENT_NOT_FOUND(2006, "你找的评论已经不存在了"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在");


    private String message;
    private Integer code;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
