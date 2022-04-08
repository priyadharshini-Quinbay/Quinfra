package com.quinbay.march2022.Mongodb.controller;


import antlr.collections.impl.LList;
import com.quinbay.march2022.Mongodb.dt.Analysis;
import com.quinbay.march2022.Mongodb.dto.*;
import com.quinbay.march2022.Mongodb.entity.UserEntity;
import com.quinbay.march2022.Mongodb.service.StudentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/Ads")
public class AdsController {


    @Autowired
    StudentService st;

//    @GetMapping(value="/getAds/{category}")
//
//    public Response<List<Ads>> getAllTutorials(@PathVariable(value="category") String[] category) {
//
//        List<Ads> list =  st.getAllAds(category);
//        if(list!=null){
//            return new Response<>(list);
//        }else {
//            return new Response<>(1002 , "Error while fetching the ads");
//        }
//    }
@GetMapping("/ads1")

public Response<List<Ads>> getAllAds() {
    List<Ads> list=st.getAds();
    if(list!=null){
        return new Response<>(list);
    }else {
        return new Response<>(1002 , "Error while fetching the all Ads");
    }
}

    @GetMapping("/getBrand")

    public Response<List<Brands>> getBrands() {
        List<Brands> list=st.getBrands();
        if(list!=null){
            return new Response<>(list);
        }else {
            return new Response<>(1002 , "Error while fetching the all Brands");
        }
    }

    @GetMapping("/getAds")

    public Response<List<Ads>> getAds(@RequestParam String Username) {
        List<Ads> list=st.getAllAds(Username);
        if(list!=null){
            return new Response<>(list);
        }else {
            return new Response<>(1002 , "Error while fetching the Ads");
        }
    }

    @GetMapping("/getlikes")

    public Response<List<LikeAds>> getAllTutorial() {
        List<LikeAds> list=st.getAllLikes();
        if(list!=null){
            return new Response<>(list);
        }else {
            return new Response<>(1002 , "Error while fetching the Likes");
        }
    }
    @GetMapping("/analysis1")

    public Response<List<Analysis>> analysis1() {
        List<Analysis> list=st.Analysis();
        if(list!=null){
            return new Response<>(list);
        }else {
            return new Response<>(1002 , "Error while Analysis1");
        }
    }

    @GetMapping("/analysis2")

    public Response<List<Analysis>> analysis2() {
        List<Analysis> list=st.Analysis2();
        if(list!=null){
            return new Response<>(list);
        }else {
            return new Response<>(1002 , "Error while Analysis2");
        }
    }
    @GetMapping("/analysis3")

    public Response<List<Analysis>> analysis3() {
        List<Analysis> list=st.Analysis3();
        if(list!=null){
            return new Response<>(list);
        }else {
            return new Response<>(1002 , "Error while Analysis3");
        }
    }

    @GetMapping("/analysis4")

    public Response<List<Analysis>> analysis4() {
        List<Analysis> list=st.Analysis4();
        if(list!=null){
            return new Response<>(list);
        }else {
            return new Response<>(1002 , "Error while Analysis4");
        }
    }
    @GetMapping("/getUser")

    public Response<List<UserEntity>> getUser() {
        List<UserEntity> list=st.getUser();
        if(list!=null){
            return new Response<>(list);
        }else {
            return new Response<>(1002 , "Error while fetching the User");
        }
    }

    @PostMapping("/ads")
    public Response<Ads> addAds(@RequestBody Ads ads)
    {

        Ads ads1 = st.addAds(ads);
        if(ads1!=null){
            return new Response<>(ads1);
        }else{
            return new Response<>(1001 , "Error while Adding Advertisement");
        }
    }

    @PostMapping("/addBrands")
    public Response<Brands> addBrands(@RequestBody Brands ads)
    {

        Brands ads1 = st.addBrands(ads);
        if(ads1!=null){
            return new Response<>(ads1);
        }else{
            return new Response<>(1001 , "Error while Adding Brands");
        }
    }

    @PostMapping("/User")
    public Response<UserEntity> addAds(@RequestBody UserEntity ads)
    {

        ReturnAfterSavingUser ads1 = st.addUser(ads);
        if(ads1.getVal()==1){
            return new Response<>(ads1.getUserEntity());
        }else if(ads1.getVal() == 0){
            return new Response<>(1001 , "Error while Adding User");
        }else {
            return new Response<>(1002 , "Already user present");
        }
    }


    @PostMapping("/likes")
    public Response<LikeAds> addLikes(@RequestBody LikeAds ads)
    {
        LikeAds ads1 = st.addLikes(ads);
        if(ads1!=null){
            return new Response<>(ads1);
        }else{
            return new Response<>(1001 , "Error while Adding Likes");
        }
    }



}
