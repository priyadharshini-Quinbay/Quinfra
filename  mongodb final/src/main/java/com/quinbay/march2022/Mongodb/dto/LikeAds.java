package com.quinbay.march2022.Mongodb.dto;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
public class LikeAds {

    @Id
    public String id;
    public String username;
    public int count;
    public String category;
    private String platform;

    public LikeAds(String id, String username, int count, String category, String platform) {
        this.id = id;
        this.username = username;
        this.count = count;
        this.category = category;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LikeAds() {

    }
}
