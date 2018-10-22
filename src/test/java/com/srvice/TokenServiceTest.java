package com.srvice; 

import base.TestBase;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;

/** 
* TokenService Tester. 
* 
* @author <Authors name> 
* @since <pre>Oct 21, 2018</pre> 
* @version 1.0 
*/ 
public class TokenServiceTest extends TestBase {
    @Autowired
    private TokenService tokenService;
    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    } 
    
        /** 
    * 
    * Method: insertToken(int userId, String tokenString) 
    * 
    */ 
    @Test
    public void testInsertToken() throws Exception { 
        tokenService.insertToken(3,"xxx");
    } 
    
        /** 
    * 
    * Method: getUserId(String tokenString) 
    * 
    */ 
    @Test
    public void testGetUserId() throws Exception { 
    //TODO: Test goes here... 
    } 
    
        
    } 
