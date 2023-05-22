package com.communitystart.communitystart.mapper;

import com.communitystart.communitystart.model.Comment;
import com.communitystart.communitystart.model.CommentExample;
import com.communitystart.communitystart.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment record);
}