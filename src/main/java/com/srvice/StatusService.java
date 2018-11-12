package com.srvice;


import com.dao.Mapper.StatusesMapper;
import com.dao.Pojo.Statuses;
import com.dao.Pojo.StatusesExample;
import com.dao.Pojo.StatusesExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    @Autowired
    private StatusesMapper statusesMapper;

    public int insertStatuses(Statuses statuse){
        return statusesMapper.insert(statuse);
    }

    public List selectStatuses(){
        StatusesExample statusesExample = new StatusesExample();
        Criteria criteria = statusesExample.createCriteria();
        return statusesMapper.selectByExampleWithBLOBs(statusesExample);
    }

    public int deleteStatuses(int userId , int statuseId){
        StatusesExample statusesExample = new StatusesExample();
        Criteria criteria = statusesExample.createCriteria();
        criteria.andIdEqualTo(statuseId);
        criteria.andUserIdEqualTo(userId);
        return statusesMapper.deleteByExample(statusesExample);
    }
}
