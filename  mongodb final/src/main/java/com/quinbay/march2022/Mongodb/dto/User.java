package com.quinbay.march2022.Mongodb.dto;

import java.util.List;

public class User {

    private String id;
    private String userName;
    private  List<String> interests;
    private String platform;

    public User(String id, String userName, List<String> interests, String platform) {
        this.id = id;
        this.userName = userName;
        this.interests = interests;
        this.platform = platform;
    }

    public String getPlatform() {

        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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

    public  List<String> getInterests() {
        return interests;
    }

    public User(String id, String userName, List<String> interests) {
        this.id = id;
        this.userName = userName;
        this.interests = interests;
    }

    public void setInterests( List<String> interests) {
        this.interests = interests;

    }

    public User() {
    }


}
