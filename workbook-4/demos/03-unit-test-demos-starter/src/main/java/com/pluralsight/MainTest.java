package com.pluralsight;

//test runner
public class MainTest
{
    public static void main(String[] args)
    {
        //we want funtion that does the work
        Car car = new Car("Ford", "Mustange");

        System.out.println(car.getSpeed());
        car.accelerate(20);
        System.out.println(car.getSpeed());
        car.accelerate(-20);
        System.out.println(car.getSpeed());

        //junit will run all the test
    }
}