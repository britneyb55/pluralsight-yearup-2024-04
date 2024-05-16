package com.pluralsight;

import com.pluralsight.models.House;
import com.pluralsight.models.Vehicle;

public class Main {
    public static void main(String[] args)
    {

        House britneyhouse = new House("Large garden home","01/02/2022",40000, "Oakland",1,1,2);


        Vehicle anaVehicle = new Vehicle("New vehicle bought for b-day", "2023",40.000,  "Ford", 2021,190000);

        System.out.println(anaVehicle.getValue());


    }
}