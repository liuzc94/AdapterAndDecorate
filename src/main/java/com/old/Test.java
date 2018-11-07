package com.old;

public class Test {
    /**
     * 修饰模式是一种特殊的适配器模式
     * 持有 父类， 对 原有的接口做了一个升级，而原来的接口也能正常使用
     * 而 适配器模式需要 写一个@Deprecated 过时的注释
     * @param args
     */

    public static void main(String[] args) {
        CommonService commonService = new CommonServiceImpl();
        System.out.println(commonService.registry("111","111"));
        System.out.println(commonService.login("111","111"));
    }
}
