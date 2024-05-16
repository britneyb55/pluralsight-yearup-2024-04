package com.pluralsight.models;

public class House extends Asset
{
    private String address;
    private int condition;
    private int squareFoot = 0;
    private int lotSize = 0;

    public House(String description, String dataAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue()
    {
        switch (getCondition())
        {
            case 1:
                double cost = 180.00 * getSquareFoot();
                double lotcost = .25 * getLotSize();
                return cost + lotcost;
            case 2:
                double cost1 = 130.00 * getSquareFoot();
                double lotcost1 = .25 * getLotSize();
                return cost1 + lotcost1;
            case 3:
                double cost2 = 90.00 * getSquareFoot();
                double lotcost2 = .25 * getLotSize();
                return cost2 + lotcost2;
            case 4:
                double cost3 = 80.00;
                double lotcost3 = .25 * getLotSize();
                return cost3 + lotcost3;

            default:
                return 0;
        }

    }


}
