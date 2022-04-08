package com.quinbay.march2022.Mongodb.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Brands {
    @Id
    private String id;

    private String images;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brands(String id, String images, String name) {

        this.id = id;
        this.images = images;
        this.name = name;
    }

    public Brands(String images) {
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Brands() {

    }

    public Brands(String id, String images) {

        this.id = id;
        this.images = images;
    }
}
