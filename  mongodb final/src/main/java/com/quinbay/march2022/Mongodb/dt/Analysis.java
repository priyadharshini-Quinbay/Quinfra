package com.quinbay.march2022.Mongodb.dt;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Analysis {
    private String category;
    private int count;
    private String platform;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Analysis(String category, int count, String platform) {

        this.category = category;
        this.count = count;
        this.platform = platform;
    }

    public Analysis(String category, int count) {
        this.category = category;
        this.count = count;
    }

    public Analysis() {

    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
