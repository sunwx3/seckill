package com.springboot.seckil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "usertest")
public class UserTest implements Serializable {
    private String username;
    private String password;
    private String repassword;
    private Integer id;

    @Override
    public String toString() {
        return "UserTest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }
    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserTest(String username, String password, Integer id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }
    public UserTest(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Column(name = "username",nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(name = "password",nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTest() {
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}

