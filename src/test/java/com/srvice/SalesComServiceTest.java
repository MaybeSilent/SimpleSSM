package com.srvice; 

import base.TestBase;
import com.dao.Pojo.SaleComments;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/** 
* SalesComService Tester. 
* 
* @author <Authors name> 
* @since <pre>Oct 28, 2018</pre> 
* @version 1.0 
*/ 
public class SalesComServiceTest extends TestBase {
    @Autowired
    private SalesComService salesComService;

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    } 
    
        /** 
    * 
    * Method: insertCom(SaleComments saleComments) 
    * 
    */ 
    @Test
    public void testInsertCom() throws Exception { 
    //TODO: Test goes here... 
    } 
    
        /** 
    * 
    * Method: selectSalesCom(int saleId) 
    * 
    */ 
    @Test
    public void testSelectSalesCom() throws Exception { 
        List<SaleComments> result = salesComService.selectSalesCom(2);
        for(SaleComments com : result){
            System.out.println(com.getText());
        }
    }
    
        
    } 
