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

    public boolean checkIn()
    {

        if(isOccupied() == true && isDirty() == true)
        {
            System.out.println("Room is not available");
            return false;
        }else{
            dirty = true;
            occupied = true;
            System.out.println("Successfully check in ");
            return true;

        }


    }

    public void checkOut()
    {
        occupied = false;
        dirty = true;
        System.out.println("Successfully check out");
        System.out.println("It is not occupied but it is dirty");
    }


    public boolean cleanRoom()
    {
        if(isOccupied() == true)
        {
            System.out.println("Room is still Occupied cannot be clean");
            return false;
        }
        else {
            dirty = false;
            System.out.println("Room is available and ready to use");
            return true;
        }
    }






}