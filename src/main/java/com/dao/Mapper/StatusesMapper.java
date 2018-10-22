package com.dao.Mapper;

import com.dao.Pojo.Statuses;
import com.dao.Pojo.StatusesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    long countByExample(StatusesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int deleteByExample(StatusesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int insert(Statuses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int insertSelective(Statuses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    List<Statuses> selectByExampleWithBLOBs(StatusesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    List<Statuses> selectByExample(StatusesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    Statuses selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") Statuses record, @Param("example") StatusesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Statuses record, @Param("example") StatusesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByExample(@Param("record") Statuses record, @Param("example") StatusesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByPrimaryKeySelective(Statuses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Statuses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByPrimaryKey(Statuses record);
}