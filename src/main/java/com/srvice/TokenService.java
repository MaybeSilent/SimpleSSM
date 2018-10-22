package com.srvice;


import com.dao.Mapper.TokensMapper;
import com.dao.Pojo.Tokens;
import com.dao.Pojo.TokensExample;
import com.dao.Pojo.TokensExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenService {
    @Autowired
    private TokensMapper tokensMapper;

    public Tokens insertToken(int userId , String tokenString){
        Tokens token = new Tokens();
        token.setUserId(userId);
        token.setToken(tokenString);
        tokensMapper.insert(token);
        return token;
    }

    public Tokens updateToken(int userId , String tokenString){
        Tokens token = getId(userId);
        token.setToken(tokenString);
        TokensExample tokensExample = new TokensExample();
        Criteria criteria = tokensExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        tokensMapper.updateByExample(token,tokensExample);
        return token;
    }

    public Tokens getId(int userId){
        TokensExample tokensExample = new TokensExample();
        Criteria criteria = tokensExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return tokensMapper.selectByExample(tokensExample).get(0);
    }

    public int getUserId(String tokenString){
        TokensExample tokensExample = new TokensExample();
        Criteria criteria = tokensExample.createCriteria();
        criteria.andTokenEqualTo(tokenString);
        List<Tokens> tokensList =  tokensMapper.selectByExample(tokensExample);
        if(tokensList.size() != 1){
            return -1;
        } else {
            return tokensList.get(0).getUserId();
        }
    }
}
