package com.pluralsight.models;

public class Cash extends Asset
{
    public Cash(String description, String dataAcquired, double originalCost) {
        super(description, dataAcquired, originalCost);

    }

    @Override
    public double getValue()
    {
        return 0;
    }



}
