package com.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class studentdetails {

    @Id
    private int rollno;
    private String name;
    private long mobile_no;
    private String email_id;
    private String branch;

    // Getters and Setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "StudentDetails [rollno=" + rollno + ", name=" + name + ", mobile_no=" + mobile_no + ", email_id=" + email_id + ", branch=" + branch + "]";
    }

    public studentdetails() {
        super();
    }

    public studentdetails(int rollno, String name, long mobile_no, String email_id, String branch) {
        super();
        this.rollno = rollno;
        this.name = name;
        this.mobile_no = mobile_no;
        this.email_id = email_id;
        this.branch = branch;
    }
} 
