package com.quinbay.march2022.Mongodb.dt;


public class LikeAdsDto {


    private String id;
    private String username;
    private int count;
    private String category;

    public LikeAdsDto() {
    }

    public LikeAdsDto(String id, String username, int count, String category) {
        this.id = id;
        this.username = username;
        this.count = count;
        this.category = category;
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
}
