package com.pluralsight;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class PayrollCalculator
{
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        userfile();

    }

    public static void userfile()
    {
        System.out.println("Enter the name of the file employee file to process employees.csv:");
        String employeeFile = userInput.nextLine().strip();

        // Load employees from the specified file
        loadEmployess(employeeFile);

        System.out.println("Enter the formate of a file that you would like to create a (csv or json) : ");
        System.out.println("csv:");
        System.out.println("json:");
        String userCsvOrJsonFile = userInput.nextLine().strip();

        if ( userCsvOrJsonFile.equalsIgnoreCase("csv"))
        {
           writeToFile();
        }
        else if(userCsvOrJsonFile.equalsIgnoreCase( "json"))
        {
            writeToFileJson();
        }
        else{
             userfile();
        }


    }


            public static void writeToFile()
            {
                String fileName = userFilerequest();

                try (FileWriter writer = new FileWriter("files/" + fileName))
                {
                    for (Employee employee : employees )
                    {
                        writer.write(employee.getEmployeeId() + " |" +
                                employee.getName() + "|" +
                                employee.getGrossPay() + "\n");
                    }

                } catch (IOException ex) {
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
                } catch (IOException ex) {
                    System.out.println("file not available");

                }


            }

            public static void writeToFileJson() {
                String fileName = jsonPayrollFile();


                try (FileWriter writer = new FileWriter("files/" + fileName))
                {
                    writer.write("[");
                    writer.write("\n");
                    for (Employee employee : employees)
                    {
                        writer.write(" ".repeat(5));

                        writer.write(String.format("{\"id\": %d, \"name\": \"%s\", \"grossPay\": %.2f}",
                                employee.getEmployeeId(), employee.getName(), employee.getGrossPay()));
                        writer.write(",");
                        writer.write("\n");


                    }
                    writer.write("]");
                } catch (IOException ex)
                {
                    System.out.println("File failed");
                }
            }


            public static String userFilerequest() {
                String newPayrollFile;
                System.out.println("Enter the name of the payroll file to create: (e.g., payroll-sept-2023.csv):");
                newPayrollFile = userInput.nextLine().strip();
                return newPayrollFile;
            }

            public static String jsonPayrollFile() {

                System.out.println("Enter the name of the payroll file to create(e.g. payroll-sept-2023.json):");
                String newPayrollFile = userInput.nextLine().strip();
                return newPayrollFile;

            }




}

