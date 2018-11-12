package com.controller;

import com.authorization.annotation.Authorization;
import com.authorization.constant.Constant;
import com.dao.Pojo.StatusReplies;
import com.dao.Pojo.Users;
import com.srvice.StatusReplyService;
import com.srvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ReplyController {

    @Autowired
    private StatusReplyService statusReplyService;

    @Autowired
    private UserService userService;

    @ResponseBody
    @Authorization
    @RequestMapping(value = "/statusReply" , method = POST)
    public HashMap<String,Object> getReply(HttpServletRequest request , @RequestBody StatusReplies statusReply){
        HashMap<String,Object> response = new HashMap<>();

        int userid = (int) request.getAttribute(Constant.CURRENT_USER_ID);
        Users user = userService.findById(userid);
        user.setPasswordHash(null);

        statusReply.setUserId(userid);
        statusReply.setTimestamp(new Date());

        statusReplyService.insertReply(statusReply);
        response.put("user",user);
        response.put("statusReply",statusReply);
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/statusReply" , method = GET)
    public List getReplies(@RequestParam("statusId") int statusId){
        return statusReplyService.selectReply(statusId);
    }

    @Authorization
    @ResponseBody
    @RequestMapping(value = "statusReplyDelete" , method = POST)
    public HashMap<String,Boolean> deleteReply(HttpServletRequest request , @RequestBody StatusReplies statusReply){
        HashMap<String,Boolean> response = new HashMap<>();

        int replyId = statusReply.getId();
        boolean successed = statusReplyService.deleteReply((int) request.getAttribute(Constant.CURRENT_USER_ID),replyId);

        response.put("successed",successed);
        return response;
    }
}
