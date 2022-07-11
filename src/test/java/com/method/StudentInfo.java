package com.method;

import java.util.List;

public class StudentInfo {
    public int id;
    public String name;
    public String address;
    public String phone_No;

    public StudentInfo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_No() {
        return phone_No;
    }

    public void setPhone_No(String phone_No) {
        this.phone_No = phone_No;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentInfo(int id, String name, String phone_No, String address) {
        this.id = id;
        this.name = name;
        this.phone_No = phone_No;
        this.address = address;
    }
}

