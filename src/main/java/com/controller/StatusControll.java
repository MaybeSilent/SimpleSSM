package com.controller;


import com.authorization.annotation.Authorization;
import com.authorization.constant.Constant;
import com.dao.Pojo.Statuses;
import com.dao.Pojo.Users;
import com.srvice.StatusService;
import com.srvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class StatusControll {
    @Autowired
    private StatusService statusService;

    @Autowired
    private UserService userService;

    @Authorization
    @ResponseBody
    @RequestMapping(value = "/statuses" , method = POST)
    public HashMap<String,Object> getStatus(HttpServletRequest request, @RequestBody Statuses statuse){
        HashMap<String,Object> response = new HashMap<>();

        int userid = (int) request.getAttribute(Constant.CURRENT_USER_ID);
        Users user = userService.findById(userid);
        user.setPasswordHash(null);
        statuse.setUserId(userid);
        statuse.setTimestamp(new Date());
        statusService.insertStatuses(statuse);
        response.put("user",user);
        response.put("statuse",statuse);
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/statuses" , method = GET)
    public List selectStatus() {
        return statusService.selectStatuses();
    }

    @Authorization
    @ResponseBody
    @RequestMapping(value = "/statusesDelete",method = POST)
    public HashMap<String , Boolean> deleteStatus(HttpServletRequest request, @RequestBody Statuses statuse){
        HashMap<String,Boolean> response = new HashMap<>();

        int userid = (int) request.getAttribute(Constant.CURRENT_USER_ID);
        int statusId = statuse.getId();
        int successed = statusService.deleteStatuses(userid,statusId);
        if(successed == 0){
            response.put("successed",false);
        } else {
            response.put("successed",true);
        }

        return  response;
    }


}
