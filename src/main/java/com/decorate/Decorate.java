package com.decorate;

import com.old.CommonService;

public interface Decorate extends CommonService {
    public String registry(String username, String password);
    public String login(String username, String password);

    public String QQLogin(String openid);

}
