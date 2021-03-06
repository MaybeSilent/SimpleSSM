package com.dao.Mapper;

import com.dao.Pojo.StatusReplies;
import com.dao.Pojo.StatusRepliesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusRepliesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    long countByExample(StatusRepliesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int deleteByExample(StatusRepliesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int insert(StatusReplies record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int insertSelective(StatusReplies record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    List<StatusReplies> selectByExampleWithBLOBs(StatusRepliesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    List<StatusReplies> selectByExample(StatusRepliesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    StatusReplies selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") StatusReplies record, @Param("example") StatusRepliesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") StatusReplies record, @Param("example") StatusRepliesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByExample(@Param("record") StatusReplies record, @Param("example") StatusRepliesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByPrimaryKeySelective(StatusReplies record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(StatusReplies record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_replies
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByPrimaryKey(StatusReplies record);
}