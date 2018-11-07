package com.adapter;

public class Test {
    /**
     * la老系统运行了很久比较稳定，为了保持稳定性，但又要兼容新的需求，我们需要向下兼容
     * （适配器模式）
     * @param args
     */
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.QQLongin("liuzc");

    }
}
