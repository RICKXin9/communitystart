package com.communitystart.communitystart.dto;

import com.communitystart.communitystart.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;


    private Long parentId;

    private Integer type;

    private Integer commentator;

    private Long gmtCreate;

    private Long gmtModified;


    private Long likeCount;


    private String content;
    private User user;
    private Integer commentCount;
}
