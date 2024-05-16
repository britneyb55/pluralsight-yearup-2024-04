package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee
{
    private final double OVERTIME_RATE = 1.5;
    private final int REGULAR_HOURS = 40;

    String name;
    String department;
    double payRate;
    double hoursWorked;
    int employeeId;
    double timeStart;
    double timeEnd;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department)
{
    this.department = department;
}

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked()
    {

        return hoursWorked;

    }


    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    // derived

    public boolean isOvertime()
    {
        return hoursWorked > REGULAR_HOURS;
    }

    public double getRegularPay()
    {
        return getRegularHours() * payRate;
    }

    public double getOverTimePay()
    {
        return getOvertimeHours() * payRate * OVERTIME_RATE;
    }

    public double getTotalPay()
    {
        return getRegularPay() + getOverTimePay();
    }

    public double getRegularHours()
    {
//        if(isOvertime()){
//            return 40;
//        }
//        else {
//            return hoursWorked;
//        }

        return isOvertime()
                ? REGULAR_HOURS
                : hoursWorked;
    }

    public double getOvertimeHours()
    {
//        if(!isOvertime()){
//            return 0;
//        }
//        else {
//            return hoursWorked - 40;
//        }
        return !isOvertime() ? 0 : hoursWorked - REGULAR_HOURS;
    }



    public void punchIn(double time)
    {
        this.timeStart = time;

    }



    public void punchOut(double time)
    {
        this.timeEnd = time;
        double newHours = timeEnd - timeStart;
        this.hoursWorked += newHours;

    }

    public void punchIn()
    {
        LocalTime today = LocalTime.now();
        DateTimeFormatter formateTime = DateTimeFormatter.ofPattern("HH");
        String hours = today.format(formateTime);
        DateTimeFormatter formatMin = DateTimeFormatter.ofPattern("mm");
        String minutes = today.format(formatMin);
        int hour = Integer.parseInt(hours);
        int min =  Integer.parseInt(minutes);
        double timeIn = hour + (min / 60.0);
        System.out.println(" Successfully Punch in at " + timeIn);
        punchIn(timeIn);
    }

    public void punchOut()
    {
        LocalTime today = LocalTime.now();
        DateTimeFormatter formateTime = DateTimeFormatter.ofPattern("HH");
        String hours = today.format(formateTime);
        DateTimeFormatter formatMin = DateTimeFormatter.ofPattern("mm");
        String minutes = today.format(formatMin);
        double hour = Double.parseDouble(hours);
        double min =  Double.parseDouble(minutes);
        double time = hour + (min / 60.0);

        System.out.println(" Successfully Punch out at " + time);
        punchOut(time);

    }







}
