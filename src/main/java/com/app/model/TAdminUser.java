package com.app.model;

public class TAdminUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.user_pwd
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String user_pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.user_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String user_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.permission
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private String permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.type
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.id
     *
     * @return the value of t_admin_user.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.id
     *
     * @param id the value for t_admin_user.id
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.user_pwd
     *
     * @return the value of t_admin_user.user_pwd
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getUser_pwd() {
        return user_pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.user_pwd
     *
     * @param user_pwd the value for t_admin_user.user_pwd
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd == null ? null : user_pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.user_name
     *
     * @return the value of t_admin_user.user_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.user_name
     *
     * @param user_name the value for t_admin_user.user_name
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.permission
     *
     * @return the value of t_admin_user.permission
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.permission
     *
     * @param permission the value for t_admin_user.permission
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.type
     *
     * @return the value of t_admin_user.type
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.type
     *
     * @param type the value for t_admin_user.type
     *
     * @mbg.generated Mon Aug 29 15:23:29 CST 2022
     */
    public void setType(Integer type) {
        this.type = type;
    }
}