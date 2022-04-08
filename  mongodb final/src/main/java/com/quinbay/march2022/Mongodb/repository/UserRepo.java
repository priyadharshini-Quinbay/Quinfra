package com.quinbay.march2022.Mongodb.repository;

import com.quinbay.march2022.Mongodb.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends MongoRepository<UserEntity,String> {
     List<UserEntity> findByUserName(String userName) ;
     List<UserEntity> findByPlatform(String platform) ;


}
