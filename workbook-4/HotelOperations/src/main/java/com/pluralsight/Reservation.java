package com.pluralsight;

public class Reservation
{
    String RoomType;
    double price;
    int numberOfNights = 0;
    boolean weekend = false;
    double reservationTotal;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        RoomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType()
    {
        return RoomType;
    }

    public void setRoomType(String roomType)
    {

        RoomType = roomType;
    }

    public double getPrice()
    {
        if (getRoomType().equalsIgnoreCase("king"))
        {
            return price = 139.00;
        }
        else {
            return price = 124.00;
        }

    }


    public int getNumberOfNights()
    {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights)
    {
        this.numberOfNights = numberOfNights;
    }

    public boolean weekend()
    {
        return weekend;
    }

    public double getWeekendPrice()
    {
        if (weekend() == true)
        {
            double increase = getPrice() * 0.10;
            double weekendPrice = getPrice() + increase;
            return weekendPrice;
        }
        else
        {
           return getPrice();
        }
    }

    public void setIsWeekend(boolean isWeekend)
    {
        this.weekend = isWeekend;
    }

    public double getReservationTotal()
    {
        reservationTotal = getWeekendPrice();
        return reservationTotal;
    }





}
