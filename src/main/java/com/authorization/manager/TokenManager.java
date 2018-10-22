package com.authorization.manager;

import com.dao.Pojo.Tokens;

public interface TokenManager {

    public Tokens updateToken(int userId);

    public Tokens createToken(int userId);

    public boolean checkToken(Tokens model);

    public Tokens getToken(String authentication);

}
