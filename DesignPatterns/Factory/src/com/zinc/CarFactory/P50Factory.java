package com.zinc.CarFactory;

public class P50Factory implements Factory{

    @Override
    public P50 product(){
        return new P50();
    }

}
