package com.pluralsight;
import org.json.JSONObject;

import org.w3c.dom.ls.LSOutput;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class PayrollCalculator
{
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        String[] employee =
                {
                        "id|name|gross pay",
                        "111|Cameron Tay|3277.65",
                        "222|James Tee|2150.00"
                };
        writeToFile(employee);



    }

    public static void writeToFile(String[] words)
    {
        String existfileName = exitingFile();
        loadEmployess(existfileName);
        String fileName = userFilerequest();

        try (FileWriter writer = new FileWriter("files/"+ fileName))
        {
            for (String line : words)
            {

                writer.write(line);
                writer.write("\n"); // adds a new line

            }

            for (Employee employee : employees)
            {
                writer.write(employee.getEmployeeId() + " |" +
                        employee.getName() + "|" +
                        employee.getGrossPay() + "\n");
            }

        } catch (IOException ex)
        {
            System.out.println("File failed");
        }
    }


    public static void loadEmployess(String filename) {

        File file = new File("files/" + filename);

        try (Scanner fileScanner = new Scanner(file)) {
            fileScanner.nextLine();

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] columns = line.split("[|]");

                int employeeId = Integer.parseInt(columns[0]);
                String name = columns[1];
                double hoursWorked = Double.parseDouble(columns[2]);
                double payRate = Double.parseDouble(columns[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                employees.add(employee);
            }
        } catch (IOException ex)
        {
            System.out.println("file not available");

        }


    }

    public static String exitingFile()
    {
        String employeefile;
        System.out.println();
        System.out.println("Enter the name of the file employee file to process employees.csv:");
        employeefile = userInput.nextLine().strip();
        return employeefile;
    }

    public static String userFilerequest()
    {
        String newPayrollFile;
        System.out.println("Enter the name of the payroll file to create: (e.g., payroll-sept-2023.csv):");
        newPayrollFile = userInput.nextLine().strip();
        return  newPayrollFile;
    }

    public static String jsonPayrollFile()
    {

        System.out.println("Enter the name of the payroll file to create(e.g. payroll-sept-2023.json):");
        String newPayrollFile = userInput.nextLine().strip();
        return newPayrollFile;

    }

    public static void writeToFileJson(String[] words)
    {
        String existfileName = exitingFile();
        loadEmployess(existfileName);
        String fileName = jsonPayrollFile();

        try (FileWriter writer = new FileWriter("files/"+ fileName))
        {
            for (String line : words)
            {
                writer.write("[");

                writer.write(line);
                writer.write("\n"); // adds a new line

                writer.write("]");

            }

            for (Employee employee : employees)
            {
                writer.write(employee.getEmployeeId() + " |" +
                        employee.getName() + "|" +
                        employee.getGrossPay() + "\n");
            }

        } catch (IOException ex)
        {
            System.out.println("File failed");
        }
    }


}