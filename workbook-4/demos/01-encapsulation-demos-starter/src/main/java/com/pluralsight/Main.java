package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Car mustang= new Car("ford", "mustang");

        System.out.println();
        System.out.println("Start");
        mustang.accelerate(100);

        System.out.println();
        System.out.println("slowing down");
        mustang.declerate(50);


        System.out.println();
        System.out.println("Stopping");
        mustang.splanOnBrakes();


    }
}