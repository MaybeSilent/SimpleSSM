package com.srvice;

import com.dao.Mapper.SalesMapper;
import com.dao.Mapper.UsersMapper;
import com.dao.Pojo.Sales;
import com.dao.Pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalesService {

    @Autowired
    private SalesMapper salesMapper;

    public int insertSales(Sales sales){
        return salesMapper.insert(sales);
    }

}
