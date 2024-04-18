package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneService
{
    private static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args)
    {
       // CellPhone cellphone1 = new CellPhone();
        CellPhone cellphone1 = ClientInformation();
        //cellphone1.setOwner("Dana wyatt");
        cellphone1.dial("855-555-2222");
        System.out.println();

        System.out.println();
       // CellPhone cellphone2 = new CellPhone();
        CellPhone cellphone2 = ClientInformation();
        //display(cellphone1);
        //display(cellphone2);
        cellphone1.dial( cellphone2.getPhoneNumber());

        System.out.println();
        cellphone2.dial( cellphone1.getPhoneNumber() );

    }
    public static CellPhone ClientInformation()
    {
        // declare variables
        int serialnumber;


        //get the client information
        System.out.print("What is the serial number?");
        serialnumber = userinput.nextInt();
        userinput.nextLine();

        System.out.print("What model is the phone?");
        String model = userinput.nextLine();


        System.out.print("Who is the carrier?");
        String carrier = userinput.nextLine();

        System.out.print("What is the phone number?");
        String phonenumber = userinput.nextLine();

        System.out.print("Who is the owner of the phone?");
        String owner = userinput.nextLine();

        //create a person cellphone
        CellPhone person_cellphone = new CellPhone();
        person_cellphone.setSerialNumber(serialnumber);
        person_cellphone.setCarrier(carrier);
        person_cellphone.setModel(model);
        person_cellphone.setPhoneNumber(phonenumber);
        person_cellphone.setOwner(owner);


        return person_cellphone;


    }

    public static void display(CellPhone phone)
    {
        System.out.println();
        System.out.println("Client cellPhone information:");
        System.out.println("------------------------------");
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model:" + phone.getModel());
        System.out.println("SerialNumber:" + phone.getSerialNumber());
        System.out.println("Company:"+ phone.getCarrier());
        System.out.println("Owner Phone number:" + phone.getPhoneNumber());


    }

    public static void dial(CellPhone person_phone)
    {
        System.out.println();
        System.out.print("Who do you want to call?");
        String phonenumber = userinput.nextLine();
        person_phone.dial(phonenumber);
        System.out.println();

    }
}