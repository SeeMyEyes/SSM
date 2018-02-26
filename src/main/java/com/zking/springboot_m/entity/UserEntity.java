package com.zking.springboot_m.entity;

public class UserEntity {
    private int uid;
    private String uname;
    private String uage;

    public UserEntity(int uid, String uname, String uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }
    public UserEntity() {

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUage() {
        return uage;
    }

    public void setUage(String uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage='" + uage + '\'' +
                '}';
    }
}
