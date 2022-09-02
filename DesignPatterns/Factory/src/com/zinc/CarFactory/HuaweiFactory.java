package com.zinc.CarFactory;

public class HuaweiFactory {
    public HuaweiPhone product(String type){
        if("mate50".equalsIgnoreCase(type)){
            return new Mate50();
        }else if("p50".equalsIgnoreCase(type)){
            return new P50();
        } else {
            throw new RuntimeException("不存在");
        }
    }

}
