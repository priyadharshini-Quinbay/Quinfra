package com.quinbay.march2022.Mongodb.dto;

import com.quinbay.march2022.Mongodb.entity.UserEntity;

public class ReturnAfterSavingUser {
    private Integer val;
    private UserEntity userEntity;

    public ReturnAfterSavingUser(Integer val, UserEntity userEntity) {
        this.val = val;
        this.userEntity = userEntity;
    }

    public ReturnAfterSavingUser() {
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
