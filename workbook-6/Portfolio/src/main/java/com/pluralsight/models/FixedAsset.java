package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

public abstract class FixedAsset implements Valuable
{
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }


    public abstract double getValue();

}
