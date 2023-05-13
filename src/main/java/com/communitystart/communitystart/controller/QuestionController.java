package com.communitystart.communitystart.controller;


import com.communitystart.communitystart.dto.CommentCreateDTO;
import com.communitystart.communitystart.dto.CommentDTO;
import com.communitystart.communitystart.dto.QuestionDTO;
import com.communitystart.communitystart.service.CommentService;
import com.communitystart.communitystart.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id, Model model) {
        QuestionDTO questionDTO = questionService.getById(id);
        // 累加阅读数
        questionService.incView(id);
        List<CommentDTO> comments = commentService.listByQuestionId(id);
        model.addAttribute("question", questionDTO);
        model.addAttribute("comments", comments);
        return "question";
    }
}
