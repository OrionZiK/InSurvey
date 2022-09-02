package com.zinc.simple;

public class Client {
    public static void main(String[] args) {
        HuaweiFactory factory = new HuaweiFactory();
        HuaweiPhone p50 = factory.product("p50");
        p50.call();
    }
}
