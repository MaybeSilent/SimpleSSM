package com.dao.Pojo;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password_hash
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private String passwordHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.avatar
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.self_intro
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private String selfIntro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.gender
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    private Integer gender;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.email
     *
     * @return the value of users.email
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.email
     *
     * @param email the value for users.email
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password_hash
     *
     * @return the value of users.password_hash
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password_hash
     *
     * @param passwordHash the value for users.password_hash
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash == null ? null : passwordHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.avatar
     *
     * @return the value of users.avatar
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.avatar
     *
     * @param avatar the value for users.avatar
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.self_intro
     *
     * @return the value of users.self_intro
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public String getSelfIntro() {
        return selfIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.self_intro
     *
     * @param selfIntro the value for users.self_intro
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setSelfIntro(String selfIntro) {
        this.selfIntro = selfIntro == null ? null : selfIntro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.gender
     *
     * @return the value of users.gender
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.gender
     *
     * @param gender the value for users.gender
     *
     * @mbg.generated Sun Oct 21 14:39:24 CST 2018
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }
}