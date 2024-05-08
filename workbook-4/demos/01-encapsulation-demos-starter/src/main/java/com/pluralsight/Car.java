package com.pluralsight;

public class Car
{
    int speed;
    String model;
    String make;

    public Car(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    //the user has to interact with it like the gas patel to accelerate
    public void accelerate(int finalSpeed)
    {
        try {
            while (speed < finalSpeed) {
                speed += 1;
                System.out.println(speed);
                Thread.sleep(5);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("There was an error accelerating");
        }
    }

    public void declerate(int finalSpeed)
    {
        try
        {
                while (speed > finalSpeed)
                {
                    speed -=1;
                    System.out.println(speed);
                    Thread.sleep(5);

                }
        }
        catch(InterruptedException e)
        {
            System.out.println("There was an error decelerating");
        }
    }

    public void splanOnBrakes()
    {
        try {
            while (speed > 0) {
                speed -= 10;
                System.out.println(speed);
                Thread.sleep(5);
            }
            speed = 0;
        }
        catch(InterruptedException e)
        {
            System.out.println("There was an error");
        }

    }
}
