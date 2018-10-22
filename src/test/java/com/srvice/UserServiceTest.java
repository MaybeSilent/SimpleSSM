package com.srvice;

import base.TestBase;
import com.dao.Pojo.Users;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/** 
* UserService Tester. 
* 
* @author <Authors name> 
* @since <pre>Oct 21, 2018</pre> 
* @version 1.0 
*/ 
public class UserServiceTest extends TestBase {
    @Autowired
    private  UserService userService;

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {

    }

    /**
    *
    * Method: findByName(String username)
    *
    */
    @Test
    public void testFindByName() throws Exception {
        List<Users> usersList = userService.findByName("guzhanpeng");
        for(Users user : usersList){
            System.out.println(user.getId());
            System.out.println(user.getUsername());
            System.out.println(user.getPasswordHash());
        }
    }

} 
