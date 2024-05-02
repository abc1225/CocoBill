package com.copasso.cocobill.utils;

import com.copasso.cocobill.model.bean.remote.MyUser;

public class LocalUserUtils {

    public static MyUser user;

    public static void setUser(MyUser myUser){
        user = myUser;
    }

    public static MyUser getUser(){
        if(null == user){
            user = new MyUser();
            user.setObjectId("objid");
            user.setAge("20");
            user.setUsername("用户名");
            user.setPassword("密码");
            user.setEmail("testemail@qq.com");
            user.setGender("男");
            user.setMobilePhoneNumber("15608493232");
        }
        return user;
    }



}
