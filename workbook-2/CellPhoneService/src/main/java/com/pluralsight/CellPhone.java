package com.pluralsight;

public class CellPhone
{
    private int SerialNumber;
    private String model;
    private String carrier;
    private String PhoneNumber;
    private String owner;

    public CellPhone()
    {
        this.SerialNumber = 0;
        this.model="";
        this.carrier= "";
        this.PhoneNumber= "";
        this.owner= "";

    }

    public int getSerialNumber()
    {
        return this.SerialNumber;
    }
    public void setSerialNumber(int SerialNumber)
    {
        this.SerialNumber = SerialNumber;
    }

    public String getModel()
    {
        return this.model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }

    public String getCarrier()
    {
        return this.carrier;
    }
    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    public String getPhoneNumber()
    {
        return this.PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.PhoneNumber = phoneNumber;
    }

    public String getOwner()
    {
        return this.owner;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public void dial(String PhoneNumber)
    {
        System.out.printf("%s phone is calling %s", owner, PhoneNumber);
    }
}

