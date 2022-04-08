package com.quinbay.march2022.Mongodb.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
public class Ads {

    @Id
    private String id;
//@NotBlank(message = "Ads name cannot be empty")
    private String image;
    private String title;
    private String category;

   // public int did;

    public Ads(String image, String title, String category) {
        this.image = image;
        this.title = title;
        this.category = category;

    }
    public Ads(String id, String image) {
        this.id = id;
        this.image = image;
    }

    public Ads(String id, String image, String title, String category) {

        this.id = id;
        this.image = image;
        this.title = title;
        this.category = category;

    }


    public Ads() {
    }

    public String getId() {

        return id;
    }

    public void setId( String id) {
        this.id = id;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
