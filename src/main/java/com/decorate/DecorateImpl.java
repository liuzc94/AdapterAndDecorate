package com.decorate;

import com.old.CommonService;

public class DecorateImpl implements Decorate{
    private CommonService commonService;
    public  DecorateImpl(CommonService commonService){
        this.commonService = commonService;
    }
    public String registry(String username, String password) {
        return commonService.registry(username,password);
    }

    public String login(String username, String password) {
        return commonService.login(username,password);
    }

    public String QQLogin(String openid) {
        System.out.println("QQ注册登录");
        commonService.registry(openid,openid);
        commonService.login(openid,openid);
        return "success";
    }

}
