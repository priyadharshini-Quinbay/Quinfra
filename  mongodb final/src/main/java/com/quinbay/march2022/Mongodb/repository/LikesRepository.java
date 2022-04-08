package com.quinbay.march2022.Mongodb.repository;


import com.quinbay.march2022.Mongodb.dt.Analysis;
import com.quinbay.march2022.Mongodb.dto.LikeAds;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LikesRepository extends MongoRepository<LikeAds, String> {

    Optional<LikeAds> findFirstByUsernameAndCategory(String username,String category);
    List<LikeAds> findByPlatform(String platform) ;

}