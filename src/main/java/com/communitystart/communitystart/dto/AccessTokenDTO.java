package com.communitystart.communitystart.dto;
// 方法传递参数超过两个，封装成一个对象

import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String state;
    private String redirect_uri;
}
