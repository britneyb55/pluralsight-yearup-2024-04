package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest
{
    @Test
    public void employee_punchInAndPunchOut()
    {
        //arrange -setup
        Employee Ana = new Employee(1,"Ana", "Photo", 20, 0);
        double clockIn = 10.0;//10am
        double clockOut = 18.5; //6:30pm
        double expected_hours = 8.5;

        //act
        Ana.punchIn(clockIn);
        Ana.punchOut(clockOut);

        //assert
        double employee_hours = Ana.getHoursWorked();
        assertEquals(expected_hours, employee_hours);
    }

    public void employee_punchInAndPunchOutLocalTine()
    {
        //arrange -setup
        Employee Ana = new Employee(1,"Ana", "Photo", 20, 0);
        double expected_hours = 8.5;

        //act
        Ana.punchIn();
        Ana.punchOut();

        //assert
        double employee_hours = Ana.getHoursWorked();
        assertEquals(expected_hours, employee_hours);
    }




}