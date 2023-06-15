package com.communitystart.communitystart.mapper;

import com.communitystart.communitystart.dto.QuestionQueryDTO;
import com.communitystart.communitystart.model.Question;
import com.communitystart.communitystart.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
    List<Question> selectRelated(Question record);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);

}