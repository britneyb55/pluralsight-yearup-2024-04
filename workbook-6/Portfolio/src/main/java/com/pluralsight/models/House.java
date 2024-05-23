package com.pluralsight.models;

public class House extends FixedAsset
{
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public double getValue()
    {
        int bedroomsValueSize = getBedrooms() * getSquareFeet();
        return getMarketValue() * bedroomsValueSize;
    }
}
