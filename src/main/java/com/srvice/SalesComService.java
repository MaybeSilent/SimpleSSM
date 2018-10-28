package com.srvice;


import com.dao.Mapper.SaleCommentsMapper;
import com.dao.Pojo.SaleComments;
import com.dao.Pojo.SaleCommentsExample;
import com.dao.Pojo.SaleCommentsExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesComService {
    @Autowired
    private SaleCommentsMapper saleCommentsMapper;

    public void insertCom(SaleComments saleComments){
        saleCommentsMapper.insert(saleComments);
    }

    public List<SaleComments> selectSalesCom(int saleId){
        SaleCommentsExample saleCommentsExample = new SaleCommentsExample();
        Criteria criteria = saleCommentsExample.createCriteria();
        criteria.andSaleIdEqualTo(saleId);
        return saleCommentsMapper.selectByExampleWithBLOBs(saleCommentsExample);
    }

    public boolean deleteCom(int userId , int commentsId){
        SaleCommentsExample saleCommentsExample = new SaleCommentsExample();
        Criteria criteria = saleCommentsExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andIdEqualTo(commentsId);
        return saleCommentsMapper.deleteByExample(saleCommentsExample) != 0;
    }


}
