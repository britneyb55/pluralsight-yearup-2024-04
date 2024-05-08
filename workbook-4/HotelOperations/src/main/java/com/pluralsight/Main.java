package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main

{
    public static void main(String[] args)
    {
        Room room = new Room(2,100,false,false);
        System.out.println(room.getisAvaliable());

        Reservation reserved = new Reservation("double",2,false);
        System.out.println(reserved.getReservationTotal());

        Employee Ana = new Employee(1,"Ana", "Photo", 20, 20);
        room.checkIn();
        room.checkOut();
        room.cleanRoom();

        Ana.punchIn(10);
        Ana.punchOut(18.5);
       System.out.println(Ana.getHoursWorked());

        Ana.punchIn();
        Ana.punchOut();
        System.out.println(Ana.getHoursWorked());












    }
}