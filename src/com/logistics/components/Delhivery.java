package com.logistics.components;

public class Delhivery implements  LogisticsService{


    public Delhivery(){
        System.out.println(
                "Delhivery :: 0-param constructor"
        );
    }
    public String deliver(int orderId) {

        return "Delhivery is assigned to the order Id:: " + orderId;
    }
}

