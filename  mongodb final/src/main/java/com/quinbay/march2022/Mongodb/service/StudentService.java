package com.quinbay.march2022.Mongodb.service;


import com.quinbay.march2022.Mongodb.dto.*;
import com.quinbay.march2022.Mongodb.dt.Analysis;
import com.quinbay.march2022.Mongodb.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentService
{
    List<Ads> getAllAds(String Username) ;
    List<Ads> getAds() ;
    List<Brands> getBrands() ;


    Ads addAds(Ads ads);
    Brands addBrands(Brands ads);

    List<LikeAds> getAllLikes() ;

    LikeAds addLikes(LikeAds like);

    List<Analysis> Analysis() ;
    List<Analysis> Analysis2() ;
    List<Analysis> Analysis3() ;
    List<Analysis> Analysis4() ;


    List<UserEntity> getUser() ;
    ReturnAfterSavingUser addUser(UserEntity like);

}
