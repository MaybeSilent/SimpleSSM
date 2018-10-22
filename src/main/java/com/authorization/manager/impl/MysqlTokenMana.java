package com.authorization.manager.impl;

import com.authorization.manager.TokenManager;
import com.dao.Pojo.Tokens;
import com.srvice.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MysqlTokenMana implements TokenManager {
    @Autowired
    private TokenService tokenService;

    @Override
    public Tokens createToken(int userId) {
        String token = UUID.randomUUID().toString().replace("-", "");
        return tokenService.insertToken(userId , token);
    }

    @Override
    public Tokens updateToken(int userId) {
        String tokenString = UUID.randomUUID().toString().replace("-","");
        return tokenService.updateToken(userId,tokenString);
    }

    @Override
    public boolean checkToken(Tokens model) {
        return model != null && model.getUserId() >= 0;
    }

    @Override
    public Tokens getToken(String authentication) {
        if(authentication == null) return null;
        int userid = tokenService.getUserId(authentication);
        Tokens token = new Tokens();
        token.setUserId(userid);
        token.setToken(authentication);
        return token;
    }

}
