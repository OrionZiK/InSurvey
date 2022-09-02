package com.zinc.CarFactory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new P50Factory();
        HuaweiPhone product = factory.product();
        product.call();
    }
}
