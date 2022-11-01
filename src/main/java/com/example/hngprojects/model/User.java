package com.example.hngprojects.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String slackUserName;
    private boolean backEnd;
    private int age;
    private String bio;

    public User(String userName, boolean backEnd, int age, String bio) {
        this.slackUserName = userName;
        this.backEnd = backEnd;
        this.age = age;
        this.bio = bio;
    }

    public User() {
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlackUserName() {
        return slackUserName;
    }

    public void setSlackUserName(String userName) {
        this.slackUserName = userName;
    }

    public boolean isBackEnd() {
        return backEnd;
    }

    public void setBackEnd(boolean backEnd) {
        this.backEnd = backEnd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
