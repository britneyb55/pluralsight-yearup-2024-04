package com.pluralsight.application;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;



public class NorthwindApplication
{
    DataSource dataSource;
    private String connectionString;
    private String username;
    private String password;
    private Scanner scanner = new Scanner(System.in);

    public NorthwindApplication()
    {
        readProperties();

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(connectionString);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        this.dataSource = dataSource;
    }

    private void readProperties()
    {
        Properties properties = new Properties();
        try(FileInputStream stream = new FileInputStream("src/main/resources/config.properties"))
        {
            properties.load(stream);
            connectionString = properties.getProperty("db.connectionstring");
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void run()
    {
        display();
    }

    private int homescreen()
    {
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println(" 1) Display all products");
        System.out.println(" 2) Display all customers");
        System.out.println(" 3) Display all Categories");
        System.out.println(" 0) Exit");
        System.out.println("Select an option: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void display(){
        while (true) {
            int userChoice = homescreen();

            switch (userChoice) {
                case 1:
                    displayAllProducts();
                    break;
                case 2:
                    displayAllCustomers();
                    break;
                case 3:
                    DisplayAllCategories();
                    product();
                    break;
                case 0:
                    return;
            }

        }
    }

    private void product()
    {
        System.out.println("Select a category to display the product in our store:");
        int userChoice  = Integer.parseInt(scanner.nextLine());


        // 1. open a connection to the database
        // use the database URL to point to the correct database
        try(Connection connection = dataSource.getConnection())
        {

            // 2. execute a statement
            String sql = """
                    SELECT ProductID
                            , ProductName
                            , UnitPrice
                            , UnitsInStock
                      FROM Products AS p
                      INNER JOIN Categories as c
                      ON p.CategoryID = c.CategoryID
                      WHERE p.CategoryID = ?;
                  """;



            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userChoice);

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("ProductID     ProductName                    Price      In Stock");
            System.out.println("---------     ------------------             ------     -------");

            // 2 a. - read the results
            while(resultSet.next())
            {
                int id = resultSet.getInt("ProductID");
                String Product_name = resultSet.getString("ProductName");
                Double price = resultSet.getDouble("UnitPrice");
                int onStock = resultSet.getInt("UnitsInStock");

                System.out.printf("%-12d  %-30s %-10.2f %-10d \n", id, Product_name, price, onStock);
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Press enter to go back to homeScreen");
        scanner.nextLine();


    }

    private void DisplayAllCategories()  {


        try(Connection connection = dataSource.getConnection())
        {

            String sql = """
                    SELECT CategoryID
                         , CategoryName
                       FROM Categories
                       ORDER BY CategoryID;
                 """;

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("CategoryID  Category Name      ");
            System.out.println("--------    -------------------  ");

            while (resultSet.next())
            {
                int categoryId = resultSet.getInt("CategoryID");
                String categoryName = resultSet.getString("CategoryName") ;


                System.out.printf("%-12s %-39s  \n",categoryId, categoryName);
            }

            connection.close();

        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }

        System.out.println("Press enter to continue");
        scanner.nextLine();

    }

    private void displayAllCustomers()
    {


        try(Connection connection = dataSource.getConnection())
        {



            String sql = """
                    SELECT ContactName
                    	  , CompanyName
                          , City
                          , Country
                          , Phone
                    FROM Customers
                    ORDER BY Country;
                 """;

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Contact Name                   Company name                            City                 Country        Phone Number      ");
            System.out.println("-----------------              -------------------                     ----                 ---------      ------------");

            while (resultSet.next())
            {
                String contactName = resultSet.getString("ContactName");
                String companyName = resultSet.getString("CompanyName") ;
                String city = resultSet.getString("City");
                String country = resultSet.getString("Country");
                String phoneNumber = resultSet.getString("Phone");


                System.out.printf("%-30s %-39s %-20s %-15s %-15s \n",contactName, companyName, city, country, phoneNumber  );
            }

            connection.close();

        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }

    }

    private  void displayAllProducts()
    {

        try(Connection connection = dataSource.getConnection())
        {


            String sql = """
                 SELECT ProductID
                         , ProductName
                         , UnitPrice
                         , UnitsInStock
                 FROM northwind.Products
                 ORDER BY ProductName;   
                 """;

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Name                               ");
            System.out.println("---------------------------------- ");

            while (resultSet.next())
            {
                String productName = resultSet.getString("ProductName");

                System.out.printf("%s \n",  productName );
            }

            connection.close();

        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }

    }

    public  void sqlConector()
    {
        String username = "root";
        String password = "YUm15510n";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            String sql = """
                 SELECT ProductID
                         , ProductName
                         , UnitPrice
                         , UnitsInStock
                 FROM northwind.Products;   
                 """;

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println(" Id   Name                                      Price      Stock");
            System.out.println("----- ----------------------------------        -----      -----");

            while (resultSet.next())
            {
                int id = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                Double unitPrice = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");


                System.out.printf("%-5d  %-40s %-10.2f %-10d \n", id, productName,unitPrice, unitsInStock);
            }

            connection.close();

        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }
    }

}
