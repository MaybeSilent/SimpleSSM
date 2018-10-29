package com.srvice;

import com.dao.Mapper.UsersMapper;
import com.dao.Pojo.Users;
import com.dao.Pojo.UsersExample;
import com.dao.Pojo.UsersExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

    public boolean updateUser(int userId , Users userModel){
        UsersExample usersExample = new UsersExample();
        Criteria criteria = usersExample.createCriteria();
        criteria.andIdEqualTo(userId);

        return usersMapper.updateByExampleSelective(userModel,usersExample) != 0;
    }

    public Users findById(int userId){
        UsersExample usersExample = new UsersExample();
        Criteria criteria = usersExample.createCriteria();
        criteria.andIdEqualTo(userId);

        return usersMapper.selectByExample(usersExample).get(0);
    }

    public List<Users> findByName(String username){
        UsersExample usersExample = new UsersExample();
        Criteria criteria = usersExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        return usersMapper.selectByExample(usersExample);
    }

    public int getUserId(String username){
        UsersExample usersExample = new UsersExample();
        Criteria criteria = usersExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Users> usersList = usersMapper.selectByExample(usersExample);
        return usersList.get(0).getId();
    }

    public boolean check(String username , String passwordHash){
        UsersExample usersExample = new UsersExample();
        Criteria criteria = usersExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordHashEqualTo(passwordHash);
        return usersMapper.countByExample(usersExample) == 1;
    }

    public void insertUser(String username , String passwordHash){
        Users user = new Users();
        user.setUsername(username);
        user.setPasswordHash(passwordHash);
        usersMapper.insert(user);
    }
    
    
}
