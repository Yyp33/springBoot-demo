package com.yyp.springBoot.entity;

import org.springframework.stereotype.Component;

/**
 * @author yyp
 * @slogan 致敬大师！
 * 2021/4/1 9:09 下午
 */
@Component
public class User {

    private Integer id;
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    public User(Integer id) {
        this.id = id;
    }
}
