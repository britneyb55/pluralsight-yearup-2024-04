package com.pluralsight;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PayrollCalculator
{
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args)
    {
        employeesGrossPay();

    }

    public static void employeesGrossPay()
    {

        File file = new File("files/employees.csv");

        try(Scanner fileScanner = new Scanner(file))
        {
            fileScanner.nextLine();

            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                String[] columns = line.split("[|]");

                int employeeId = Integer.parseInt(columns[0]);
                String name = columns[1];
                double hoursWorked = Double.parseDouble(columns[2]);
                double payRate = Double.parseDouble(columns[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                System.out.printf("The employee gross pay:  %-6d %-20s %-4.2f \n", employee.getEmployeeId(),
                        employee.getName(), employee.getGrossPay());

                employees.add(employee);
            }
        }
        catch(IOException ex)
        {

        }

    }

}