package com.communitystart.communitystart.dto;

import com.communitystart.communitystart.model.User;
import lombok.Data;

@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outTitle;
    private String typeName;
    private Long outid;
    private Integer type;
}
