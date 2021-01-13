package com.kzmpekos.sharetrader.models;

public class Member {
    private int userid;
    private String username, email, password;
    private boolean admin;

    public Member() {

    }

    public Member(int userid, String username, String email, String password, String mobile) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.admin = false;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin() {
        this.admin = true;
    }
}
