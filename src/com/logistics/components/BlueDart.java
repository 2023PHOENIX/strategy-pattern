package com.logistics.components;

public class BlueDart implements  LogisticsService{


   public BlueDart(){
        System.out.println(
                "BlueDart :: 0-param constructor"
        );
    }
    public String deliver(int orderId) {

        return "BlueDart is assigned to the order Id:: " + orderId;
    }
}
