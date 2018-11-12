package com.srvice;

import com.dao.Mapper.StatusRepliesMapper;
import com.dao.Pojo.StatusReplies;
import com.dao.Pojo.StatusRepliesExample;
import com.dao.Pojo.StatusRepliesExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusReplyService {
    @Autowired
    private StatusRepliesMapper statusRepliesMapper;

    public void insertReply(StatusReplies statusReplies){
        statusRepliesMapper.insert(statusReplies);
    }

    public List<StatusReplies> selectReply(int statuseId){
        StatusRepliesExample statusRepliesExample = new StatusRepliesExample();
        Criteria criteria = statusRepliesExample.createCriteria();
        criteria.andStatusIdEqualTo(statuseId);
        return statusRepliesMapper.selectByExampleWithBLOBs(statusRepliesExample);
    }

    public boolean deleteReply(int userId , int replyId){
        StatusRepliesExample statusRepliesExample = new StatusRepliesExample();
        Criteria criteria = statusRepliesExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andIdEqualTo(replyId);
        return statusRepliesMapper.deleteByExample(statusRepliesExample) != 0;
    }

}
