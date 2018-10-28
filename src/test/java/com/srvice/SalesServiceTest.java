package com.srvice; 

import base.TestBase;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;

/** 
* SalesService Tester. 
* 
* @author <Authors name> 
* @since <pre>Oct 28, 2018</pre> 
* @version 1.0 
*/ 
public class SalesServiceTest extends TestBase {

    @Autowired
    private SalesService salesService;

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    } 
    
        /** 
    * 
    * Method: insertSales(Sales sales) 
    * 
    */ 
    @Test
    public void testInsertSales() throws Exception { 
    //TODO: Test goes here... 
    } 
    
        /** 
    * 
    * Method: selectSales() 
    * 
    */ 
    @Test
    public void testSelectSales() throws Exception {
        System.out.println(salesService.selectSales());
    } 
    
        /** 
    * 
    * Method: deleteSales(int userId, int saleId) 
    * 
    */ 
    @Test
    public void testDeleteSales() throws Exception { 
    //TODO: Test goes here... 
    } 
    
        
    } 
