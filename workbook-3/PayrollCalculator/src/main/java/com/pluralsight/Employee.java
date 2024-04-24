package com.pluralsight;

public class Employee
{
    int employeeId;
    String name;
    double hoursWorked;
    double payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay()
    {
        //that calculates and returns that
        // employee's gross pay based on their hours worked and pay rate
        if (getHoursWorked() <= 40)
        {
            double grossPay = getHoursWorked() * getPayRate();
            return grossPay;
        }
        else if (getHoursWorked()>= 40)
        {
            double regularPay = 40 * getPayRate();
            double overTime =  getHoursWorked() - 40;
            double doublePay = getPayRate() * 1.5;
            double overTimeAmount = overTime * doublePay;
            double grossPay = regularPay + overTimeAmount;
            return grossPay;
        }
        else
        {
            System.out.println("not a valid number");
            return 0;
        }

    }

}
