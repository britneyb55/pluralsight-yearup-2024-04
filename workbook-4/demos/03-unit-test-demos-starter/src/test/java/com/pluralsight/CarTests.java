package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTests
{
    @Test
    public void accelerate()
    {
        Car car = new Car("","");
        car.accelerate(20);
        assertEquals(29,car.getSpeed());


    }

    //creete the like this
    @Test
    public void accelerate_Should_IncreaseTheSpeedOfTheCar_byTheIncreaseSpeedAmount()
    {
        //Arrange - setup
        // all we need is a car
        Car car = new Car("Ford", "Mustange");
        int increaseBy = 20;
        int expectedSpeed = 20;

        //act
        //what funtion are we testing related to the object
        //--> the one action that I am test;
        car.accelerate(increaseBy);

        //asser - verify that the action worked as expected
        int actualSpeed = car.getSpeed();
        assertEqual(espected, actualSpeed, "because the car starting at 0 and increase the speed by 10 Twice "

    }

}