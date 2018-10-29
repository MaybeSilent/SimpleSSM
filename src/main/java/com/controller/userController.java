package com.controller;

import com.authorization.annotation.Authorization;
import com.authorization.constant.Constant;
import com.dao.Pojo.Users;
import com.srvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/userInfo" , method = GET)
    public Users getInfo(@RequestParam("id") int userId){
        return userService.findById(userId);
    }

    @Authorization
    @ResponseBody
    @RequestMapping(value = "/userUpdate" , method = PUT)
    public Users refreshUser(HttpServletRequest request, @RequestBody Users userModel){
        int userid = (int) request.getAttribute(Constant.CURRENT_USER_ID);
        boolean flag = userService.updateUser(userid , userModel);
        if(flag) return userService.findById(userid);
        else return null;
    }
}
