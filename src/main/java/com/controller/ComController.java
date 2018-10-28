package com.controller;


import com.authorization.annotation.Authorization;
import com.authorization.constant.Constant;
import com.dao.Pojo.SaleComments;
import com.dao.Pojo.Users;
import com.srvice.SalesComService;
import com.srvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ComController {
    @Autowired
    private SalesComService salesComService;

    @Autowired
    private UserService userService;

    @ResponseBody
    @Authorization
    @RequestMapping(value = "/saleCom" , method = POST)
    public HashMap<String, Object> getComs(HttpServletRequest request, @RequestBody SaleComments saleComments){
        HashMap<String,Object> response = new HashMap<String,Object>();

        int userid = (int) request.getAttribute(Constant.CURRENT_USER_ID);
        Users user = userService.findById(userid);
        user.setPasswordHash(null);
        saleComments.setUserId(userid);
        saleComments.setTimestamp(new Date());
        salesComService.insertCom(saleComments);
        response.put("user",user);
        response.put("saleCom",saleComments);

        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/saleCom" , method = GET)
    public List getSaleComs(@RequestParam("saleId") int saleId){
        return salesComService.selectSalesCom(saleId);
    }

    @Authorization
    @ResponseBody
    @RequestMapping(value = "/saleComDelete" , method = POST)
    public HashMap<String , Boolean> deleteSales(HttpServletRequest request, @RequestBody SaleComments saleComments){
        HashMap<String,Boolean> response = new HashMap<String,Boolean>();

        int commentId = saleComments.getId();

        boolean successed = salesComService.deleteCom((int) request.getAttribute(Constant.CURRENT_USER_ID),commentId);

        response.put("successed",successed);
        return response;

    }


}
