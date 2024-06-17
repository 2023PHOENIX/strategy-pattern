package com.logistics.components;

import java.util.Arrays;
import java.util.Random;

public class Amazon {

    private LogisticsService logisticsService;

    public void setLogisticsService(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    public String buyNow(String []items, float[] itemsPrice){
        float billAmount = 0.0f;

        for(float price : itemsPrice){
            billAmount += price;
        }
        // order Id generation
        int orderId = new Random().nextInt(10000);



        logisticsService.deliver(orderId);

        return Arrays.toString(items)  + " Items price: " + Arrays.toString(itemsPrice) + " " + billAmount;
    }
}
