package com.dfq.grape.model;

import lombok.Data;

/**
 *
 */
@Data
public class Users {
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private String username;
    /**
     *
     */
    private String password;
    /**
     *
     */
    private String name;
    /**
     * 是否为管理员1是0不是
     */
    private Integer num;
    /**
     *
     */
    private String phone;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}