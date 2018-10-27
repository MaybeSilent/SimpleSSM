package com.controller;

import com.authorization.annotation.Authorization;
import com.authorization.constant.Constant;
import com.dao.Pojo.Sales;
import com.dao.Pojo.Users;
import com.srvice.SalesService;
import com.srvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class salesController {

    @Autowired
    private SalesService salesService;

    @Autowired
    private UserService userService;

    @Authorization
    @ResponseBody
    @RequestMapping(value = "/sale" , method = POST)
    public HashMap<String, Object> getsales(HttpServletRequest request, @RequestBody Sales saleModel){
        HashMap<String,Object> response = new HashMap<String,Object>();

        int userid = (int) request.getAttribute(Constant.CURRENT_USER_ID);
        Users user = userService.findById(userid);
        saleModel.setUserId(userid);
        saleModel.setTimestamp(new Date());
        salesService.insertSales(saleModel);
        response.put("user",user);
        response.put("sale",saleModel);
        return response;
    }

    @Authorization
    @ResponseBody
    @RequestMapping(value = "/saleDelete" , method = POST)
    public HashMap<String , Boolean> deleteSales(HttpServletRequest request, @RequestBody Sales saleModel){
        HashMap<String,Boolean> response = new HashMap<String,Boolean>();

        int userid = (int) request.getAttribute(Constant.CURRENT_USER_ID);
        int salesId = saleModel.getId();
        int successed = salesService.deleteSales(userid,salesId);
        if(successed == 0){
            response.put("successed",false);
            return response;
        } else {
            response.put("successed",true);
            return response;
        }
    }

}
