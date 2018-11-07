package com.old;

public class CommonServiceImpl implements CommonService{
    public String registry(String username,String password) {
        return "用户名：" + username + "密码：" + password + "注册成功";
    }

    public String login(String username,String password) {
        return "用户名：" + username + "密码：" + password + "登录成功";
    }
}
