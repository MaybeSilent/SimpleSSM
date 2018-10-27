package com.srvice;

import com.dao.Mapper.SalesMapper;
import com.dao.Pojo.Sales;
import com.dao.Pojo.SalesExample;
import com.dao.Pojo.SalesExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalesService {

    @Autowired
    private SalesMapper salesMapper;

    public int insertSales(Sales sales){
        return salesMapper.insert(sales);
    }

    public int deleteSales(int userId, int saleId){
        SalesExample salesExample = new SalesExample();
        Criteria criteria = salesExample.createCriteria();
        criteria.andIdEqualTo(saleId);
        criteria.andUserIdEqualTo(userId);
        return salesMapper.deleteByExample(salesExample);
    }

}
