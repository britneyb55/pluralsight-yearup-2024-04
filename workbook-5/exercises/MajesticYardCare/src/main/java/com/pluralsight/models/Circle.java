package com.pluralsight.models;

import static java.lang.Math.PI;

public class Circle extends Shape
{
    private int radius;

    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea()
    {

        return PI * (int) Math.pow(radius,2);
    }

    @Override
    public String toString()
    {
        return String.format("%s (radius: %d): %f", getName(), radius, getArea());
    }
}
