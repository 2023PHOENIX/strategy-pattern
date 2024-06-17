package com.logistics.factory;

import com.logistics.components.*;

public class EcommerceFactory {

    public static Amazon getInstance(String logisticsServiceName){
        LogisticsService logistics;
        Amazon amazon;

        if(logisticsServiceName.equalsIgnoreCase("delhivery")){
            logistics = new Delhivery();
        }else if(logisticsServiceName.equalsIgnoreCase("bluedart")){
            logistics = new BlueDart();
        }else{
            System.out.println("Error");
            return null;
        }
        amazon = new Amazon();
        amazon.setLogisticsService(logistics);
        return amazon;
    }
}
