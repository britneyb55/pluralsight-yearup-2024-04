package com.pluralsight;

public class Room
{
    int numberOfBeds;
    double Price;
    boolean occupied;
    boolean dirty;
    boolean available = true;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        Price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return Price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty()
    {
        return dirty;
    }

    public boolean isAvailable()
    {
        if (isOccupied() != true && isDirty() != true)
        {
            return available;
        }
        return false;
    }

    public boolean getisAvaliable()
    {
        return isAvailable();
    }

    public void checkIn()
    {
        dirty = true;
        occupied = true;
        System.out.println("Successfully check in ");

    }

    public void checkOut()
    {
        occupied = false;
        System.out.println("Successfully check out");
    }


    public void cleanRoom()
    {
        dirty = false;
        System.out.println("Room is available and ready to use" );
    }






}