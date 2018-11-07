package com.decorate;

import com.old.CommonServiceImpl;

public class Test {

    public static void main(String[] args) {
        CommonServiceImpl commonServiceImpl = new CommonServiceImpl();
        Decorate decorate = new DecorateImpl(commonServiceImpl);
        decorate.QQLogin("liuzc");
    }
}
