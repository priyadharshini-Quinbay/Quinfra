package com.quinbay.march2022.Mongodb.service;

import com.quinbay.march2022.Mongodb.dto.*;
import com.quinbay.march2022.Mongodb.dt.Analysis;
import com.quinbay.march2022.Mongodb.entity.UserEntity;
import com.quinbay.march2022.Mongodb.repository.AdsMongoRepository;

import com.quinbay.march2022.Mongodb.repository.BrandRepo;
import com.quinbay.march2022.Mongodb.repository.LikesRepository;
import com.quinbay.march2022.Mongodb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceimpl implements StudentService {


    @Autowired
    AdsMongoRepository str;
    @Autowired
    LikesRepository strp;
    @Autowired
    UserRepo user;
    @Autowired
    BrandRepo brand;


    @Override
    public List<Ads> getAllAds(String Username) {

        List<UserEntity> list = user.findByUserName(Username);
        List<String> list1 = new ArrayList<>();
        if (list.size() != 0) {
            list1 = list.get(0).getInterests();
        }
        List<Ads> list3 = str.findAll();
//        System.out.println(list3);

        if (list1.size()==0) {
            return list3;
        } else {
            List<Ads> list2 = new ArrayList<>();
            for (String s : list1) {
                list2.addAll(str.findByCategory(s));
            }

            if (list2.size() == 0) {
                return null;
            } else {
                return list2;
            }
        }
    }

    @Override
    public List<Ads> getAds() {


        List<Ads> list2 = new ArrayList<>();
                for (Ads stu : str.findAll()) {

                    list2.add(new Ads(stu.getId(), stu.getImage(), stu.getTitle(), stu.getCategory()));
                }

        if(list2.size() ==0){
            return null;
        }else{
            return list2;
        }

    }
    @Override
    public List<Brands> getBrands() {


        List<Brands> list2 = new ArrayList<>();
        for (Brands stu : brand.findAll()) {

            list2.add(new Brands(stu.getId(),stu.getImages(),stu.getName()));
        }

        if(list2.size() ==0){
            return null;
        }else{
            return list2;
        }

    }

//        String[] category=null;
//        for(UserEntity u:user.findAll())
//        {
//            if(u.getUserName().equals(Username))
//                category=u.getInterests();
//        }
//        System.out.println(category);
//        List<Ads> list = new ArrayList<>();
//
////            str.findAll().forEach(list::add);
////        System.out.println(category);
//        for (int i = 0; i < category.length; i++) {
//
//
//            for (Ads stu : str.findAll()) {
//                if (category[i].equals(stu.getCategory())) {
//                    list.add(new Ads(stu.getId(), stu.getImage(), stu.getTitle(), stu.getCategory()));
//
//                }
//            }
//
//
//        }
//



    @Override
    public List<LikeAds> getAllLikes() {

        List<LikeAds> list = new ArrayList<>();

        for (LikeAds likeAds : strp.findAll()) {
            LikeAds entity = new LikeAds();
            entity.setId(likeAds.getId());
            entity.setPlatform(likeAds.getPlatform());

            entity.setUsername(likeAds.getUsername());
            entity.setCount(likeAds.getCount());
            entity.setCategory(likeAds.getCategory());
            list.add(entity);
        }

        if(list.size() ==0){
            return null;
        }else{
            return list;
        }

    }


    @Override
    public List<UserEntity> getUser() {

        List<UserEntity> list = new ArrayList<>();

        for (UserEntity user : user.findAll()) {
            UserEntity entity = new UserEntity();
            entity.setId(user.getId());
            entity.setPlatform(user.getPlatform());

            entity.setUserName(user.getUserName());
            entity.setInterests(user.getInterests());

            list.add(entity);
        }

        if(list.size() ==0){
            return null;
        }else{
            return list;
        }

    }

    @Override
    public List<Analysis> Analysis() {

//        List<Ads> list = new ArrayList<>();

//            str.findAll().forEach(list::add);
//        System.out.println(category);
//        List<Analysis> analysis = ana.findAll();
        int shop = 0, ent = 0, learn = 0, tech = 0, food = 0;
        for (LikeAds likeAds : strp.findAll()) {
            if (likeAds.getCategory().equalsIgnoreCase("shopping"))
                shop += likeAds.getCount();
            else if (likeAds.getCategory().equalsIgnoreCase("entertainment"))
                ent += likeAds.getCount();
            else if (likeAds.getCategory().equalsIgnoreCase("technology"))
                tech += likeAds.getCount();
            else if (likeAds.getCategory().equalsIgnoreCase("learning"))
                learn += likeAds.getCount();
            else if (likeAds.getCategory().equalsIgnoreCase("food"))
                food += likeAds.getCount();


        }

        List<Analysis> list = new ArrayList<>();
        list.add(new Analysis("shopping", shop));
        list.add(new Analysis("entertainment", ent));
        list.add(new Analysis("technology", tech));

        list.add(new Analysis("learning", learn));

        list.add(new Analysis("food", food));


        if(list.size() ==0){
            return null;
        }else{
            return list;
        }


    }

    @Override
    public List<Analysis> Analysis2() {

//        List<Ads> list = new ArrayList<>();

//            str.findAll().forEach(list::add);
//        System.out.println(category);
//        List<Analysis> analysis = ana.findAll();
        int  quinbook = 0, quinoura = 0, pinstagram = 0;
        for (UserEntity likeAds : user.findAll()) {
            if (likeAds.getPlatform().equalsIgnoreCase("quinbook"))
                quinbook +=1;
            else if (likeAds.getPlatform().equalsIgnoreCase("quinoura"))
                quinoura += 1;
            else if (likeAds.getPlatform().equalsIgnoreCase("pinstagram"))
                pinstagram += 1;


        }

        List<Analysis> list = new ArrayList<>();
        list.add(new Analysis("quinbook", quinbook));
        list.add(new Analysis("quinoura", quinoura));
        list.add(new Analysis("pinstagram", pinstagram));




        if(list.size() ==0){
            return null;
        }else{
            return list;
        }


    }
    @Override
    public List<Analysis> Analysis3() {

        String platform[]={"quinbook","quinoura","pinstagram"};
        List<Analysis> list = new ArrayList<>();

        for(int i=0;i<3;i++) {
            List<LikeAds> list1 = strp.findByPlatform(platform[i]);

            int shop = 0, ent = 0, learn = 0, tech = 0, food = 0;
            for (LikeAds likeAds : list1) {

                    if (likeAds.getCategory().equalsIgnoreCase("shopping"))
                        shop += likeAds.getCount();
                    else if (likeAds.getCategory().equalsIgnoreCase("entertainment"))
                        ent += likeAds.getCount();
                    else if (likeAds.getCategory().equalsIgnoreCase("technology"))
                        tech += likeAds.getCount();
                    else if (likeAds.getCategory().equalsIgnoreCase("learning"))
                        learn += likeAds.getCount();
                    else if (likeAds.getCategory().equalsIgnoreCase("food"))
                        food += likeAds.getCount();
                }
                list.add(new Analysis("shopping", shop, platform[i]));
                list.add(new Analysis("entertainment", ent, platform[i]));
                list.add(new Analysis("technology", tech, platform[i]));

                list.add(new Analysis("learning", learn, platform[i]));

                list.add(new Analysis("food", food, platform[i]));

        }


        if(list.size() ==0){
            return null;
        }else{
            return list;
        }


    }
    @Override
    public List<Analysis> Analysis4() {

        String platform[]={"quinbook","quinoura","pinstagram"};
        List<Analysis> list = new ArrayList<>();

        for(int i=0;i<3;i++) {
            List<UserEntity> list1 = user.findByPlatform(platform[i]);

            int shop = 0, ent = 0, learn = 0, tech = 0, food = 0;
            for (UserEntity likeAds : list1) {
                for(String interest:likeAds.getInterests())
                if (interest.equalsIgnoreCase("shopping"))
                    shop +=1;
                else if (interest.equalsIgnoreCase("entertainment"))
                    ent += 1;
                else if (interest.equalsIgnoreCase("technology"))
                    tech +=1;
                else if (interest.equalsIgnoreCase("learning"))
                    learn += 1;
                else if (interest.equalsIgnoreCase("food"))
                    food += 1;
            }
            list.add(new Analysis("shopping", shop, platform[i]));
            list.add(new Analysis("entertainment", ent, platform[i]));
            list.add(new Analysis("technology", tech, platform[i]));

            list.add(new Analysis("learning", learn, platform[i]));

            list.add(new Analysis("food", food, platform[i]));

        }


        if(list.size() ==0){
            return null;
        }else{
            return list;
        }


    }
@Override
    public Brands addBrands(Brands ads) {


        Brands ads1 = brand.save(new Brands(ads.getId(),ads.getImages(),ads.getName()));
        if(ads1.getId()!=null){
            return ads1;
        }else {
            return null;
        }


    }



    public Ads addAds(Ads ads) {


        Ads ads1 = str.save(new Ads(ads.getImage(), ads.getTitle(), ads.getCategory()));
        if(ads1.getId()!=null){
            return ads1;
        }else {
            return null;
        }


    }
    public ReturnAfterSavingUser addUser(UserEntity ads) {

        List<UserEntity> userEntity = user.findByUserName(ads.getUserName());
        if(userEntity.size()==0){
            UserEntity ads1 = user.save(new UserEntity(ads.getUserName(), ads.getInterests(),ads.getPlatform()));
            if(ads1.getUserName()!=null){
                return new ReturnAfterSavingUser(1 , ads);
            }else {
                return new ReturnAfterSavingUser(0 , null);
            }
        }else{
            return new ReturnAfterSavingUser(-1 , null);
        }




    }


    public LikeAds addLikes(LikeAds ads) {
        LikeAds ads1;
        Optional<LikeAds> ad = strp.findFirstByUsernameAndCategory(ads.getUsername(), ads.getCategory());
        if (ad.isPresent()) {
            ad.get().setCount(ad.get().getCount() + 1);
            ads1=strp.save(ad.get());
        } else {
             ads1=strp.save(ads);
        }
        if(ads1.getId()!=null){
            return ads1;
        }else {
            return null;
        }
    }
}
