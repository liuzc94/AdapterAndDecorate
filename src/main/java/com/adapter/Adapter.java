package com.adapter;

import com.old.CommonServiceImpl;

public class Adapter extends CommonServiceImpl {

    //老接口的注册
    @Override
    public String registry(String username, String password) {
        return super.registry(username, password);
    }

    //老接口的登录
    @Override
    public String login(String username, String password) {
        return super.login(username, password);
    }

    //这个是在不改变老代码进行扩展的方法
    public String QQLongin(String openid){
        System.out.println("QQ注册登录");
        System.out.println(registry(openid,openid));
        System.out.println(login(openid,openid));
        return "success";
    }
}
