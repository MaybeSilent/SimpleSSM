package com.controller;

import com.authorization.manager.TokenManager;
import com.dao.Pojo.Tokens;
import com.model.LoginRegisterModel;
import com.srvice.UserService;
import com.util.MD5.MD5util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class LoginRegister {

    @Autowired
    private UserService userService;

    @Autowired
    private TokenManager tokenManager;

    @RequestMapping(value = "/register" , method = POST)
    public ResponseEntity<Tokens> register(@RequestBody LoginRegisterModel registerModel){
        Tokens token = new Tokens();
        if(registerModel.getUsername().length() == 0){
            return new ResponseEntity<>(token,HttpStatus.FORBIDDEN);
        } else if(userService.findByName(registerModel.getUsername()).size() == 1){
            return new ResponseEntity<>(token,HttpStatus.NOT_ACCEPTABLE);
        }
        String passwordHash = "";
        try {
            passwordHash = MD5util.getMD5Str(registerModel.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(token,HttpStatus.INTERNAL_SERVER_ERROR);
        }

        userService.insertUser(registerModel.getUsername(),passwordHash);
        token = tokenManager.createToken(userService.getUserId(registerModel.getUsername()));
        return new ResponseEntity<>(token,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/login" , method = POST)
    @ResponseBody
    public ResponseEntity<Tokens> login(@RequestBody LoginRegisterModel loginModel){
        Tokens token = new Tokens();
        String passwordHash = "";
        try {
            passwordHash = MD5util.getMD5Str(loginModel.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(token,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(userService.check(loginModel.getUsername() , passwordHash)){
            token = tokenManager.updateToken(userService.getUserId(loginModel.getUsername()));
            return new ResponseEntity<>(token,HttpStatus.ACCEPTED);
        }
        else
            return new ResponseEntity<>(token,HttpStatus.NOT_ACCEPTABLE);
    }
}
