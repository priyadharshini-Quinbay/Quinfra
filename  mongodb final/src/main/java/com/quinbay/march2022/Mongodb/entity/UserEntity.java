package com.quinbay.march2022.Mongodb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Document
public class UserEntity {

@Id
    private String id;
    private String userName;
    private List<String> interests;
    private String platform;

    public UserEntity(String id, String userName, List<String> interests, String platform) {
        this.id = id;
        this.userName = userName;
        this.interests = interests;
        this.platform = platform;
    }

    public UserEntity(String userName, List<String> interests, String platform) {

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

    public UserEntity() {
    }

    public UserEntity(String id, String userName, List<String> interests) {
        this.id = id;
        this.userName = userName;
        this.interests = interests;
    }
    public UserEntity( String userName, List<String> interests) {

        this.userName = userName;
        this.interests = interests;
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

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
