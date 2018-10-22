package com.dao.Mapper;

import com.dao.Pojo.Tokens;
import com.dao.Pojo.TokensExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokensMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    long countByExample(TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int deleteByExample(TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int insert(Tokens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int insertSelective(Tokens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    List<Tokens> selectByExample(TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    Tokens selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") Tokens record, @Param("example") TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByExample(@Param("record") Tokens record, @Param("example") TokensExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByPrimaryKeySelective(Tokens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tokens
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    int updateByPrimaryKey(Tokens record);
}