package com.dao.Pojo;

public class Tokens {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tokens.id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tokens.user_id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tokens.token
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private String token;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tokens.id
     *
     * @return the value of tokens.id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tokens.id
     *
     * @param id the value for tokens.id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tokens.user_id
     *
     * @return the value of tokens.user_id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tokens.user_id
     *
     * @param userId the value for tokens.user_id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tokens.token
     *
     * @return the value of tokens.token
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tokens.token
     *
     * @param token the value for tokens.token
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}