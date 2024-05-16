package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest
{
    @Test
    public void checkIn_false_ifOccupiedAndDirty()
    {
        //Arrange - set up
        Room room = new Room(2,100,false, false);
        boolean roomAvailability = false;
        boolean expected_availability = false;

        //act
        room.checkIn();

        //assert
        roomAvailability = room.getisAvaliable();
        assertEquals(expected_availability, roomAvailability);

    }

    @Test
    public void checkIn_false_IfAlreadyOccupiedAndDirty()
    //checkIn_Should_NotBeAbleToCheckInWhenItsOccupied()
    {
        //Arrange - set up
        Room room = new Room(2,100,true, true);
        boolean roomAvailability = false;
        boolean expected_availability = false;

        //act
        room.checkIn();

        //assert
        roomAvailability = room.getisAvaliable();
        assertEquals(expected_availability, roomAvailability);

    }


    @Test
    public void checkOut_IfNotOccupiedButIsDirty()
    {
        //Arrange - set up
        Room room = new Room(2,100,true, true);
        boolean expected_Availability = false;
        boolean room_Availability = false;

        //act
        room.checkOut();

        //assert
        room_Availability = room.getisAvaliable();
        assertEquals(expected_Availability, room_Availability);

    }

    @Test
    public void cleanRoom_trueAvaliableForUse_IfNotOccupiedAndIsNotDirty()
    {
        Room room = new Room(2,100,false, true);
        boolean expected_Availability = true;
        boolean room_Availability = true;

        //act
        room.cleanRoom();

        //assert
        room_Availability = room.getisAvaliable();
        assertEquals(expected_Availability,room_Availability);

    }

    @Test
    public void cleanroom_Should_NotBeAbleToCleanTheRoom_IfOccupied()
    {
        Room room = new Room(2,100,true, true);
        boolean expected_Availability = false;
        boolean room_Availability = false;

        //act
        room.cleanRoom();

        //assert
        room_Availability = room.getisAvaliable();
        assertEquals(expected_Availability,room_Availability);

    }

}


