package com.leedcp.model;

import java.util.Date;

public class User {
    private String id;

    private String userName;

    private String password;

    private String createdBy;

    private Date createdDate;

    public User(){

    }

    public User(String id,String userName, String password, String createdBy, Date date){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.createdBy = createdBy;
        this.createdDate = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }


    public  String toString(){
        return "user：" + getUserName() + "    password:" + getPassword() + "--创建时间："+ getCreatedDate();
    }
}