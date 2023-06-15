package com.communitystart.communitystart.controller;


import com.communitystart.communitystart.dto.NotificationDTO;
import com.communitystart.communitystart.dto.PaginationDTO;
import com.communitystart.communitystart.enums.NotificationTypeEnum;
import com.communitystart.communitystart.model.User;
import com.communitystart.communitystart.service.NotificationService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String profile(@PathVariable(name = "id") Long id, HttpServletRequest request ){
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) return "redirect:/";
        NotificationDTO notificationDTO = notificationService.read(id,user);
        if (NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDTO.getType()
           || NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDTO.getType()) {
            return "redirect:/question/" + notificationDTO.getOutid();
        }else {
            return "redirect:/";
        }

    }
}
