//package com.balaji.school.entities;
//
//import lombok.Data;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import javax.persistence.*;
//import java.util.Date;
//
///**
// * Created by localadmin on 23/01/17.
// */
//@Entity
//@Table(name = "users")
//@Data
//public class User {
//
//    private int id;
//    private String name;
//    private int version;
//
//    private int balance;
//    private Date created;
//    private Date Modified;
//
//    public User() {
//    }
//
//    @Id
//    @GeneratedValue
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Column(nullable = false)
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Version
//    public int getVersion() {
//        return version;
//    }
//
//    public void setVersion(int version) {
//        this.version = version;
//    }
//
//    @Column(nullable = false)
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    @CreationTimestamp
//    public Date getCreated() {
//        return created;
//    }
//
//    public void setCreated(Date created) {
//        this.created = created;
//    }
//
//    @UpdateTimestamp
//    public Date getModified() {
//        return Modified;
//    }
//
//    public void setModified(Date modified) {
//        Modified = modified;
//    }
//}