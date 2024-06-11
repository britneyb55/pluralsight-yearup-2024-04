package com.pluralsight;

import java.rmi.server.ExportException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main
{
    //display a list of city names
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        // 1.Open the connection to the database
        String connectionString = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "YUm15510n";

        //create connection objext
       try( Connection connection = DriverManager.getConnection(connectionString, username, password))
        {

            //2. execute a query and loop through all cities

            String sql = """
                    SELECT Id
                           , Name
                           , CountryCode
                           , District
                           , Population
                    FROM city
                    """;
            System.out.println();
            Statement statement = connection.createStatement();
            // Access to one at a time.
            ResultSet row = statement.executeQuery(sql);

            while (row.next()) {
                int id = row.getInt("Id");
                String city = row.getString("Name");
                String country = row.getString("CountryCode");
                String state = row.getString("District");
                int population = row.getInt("Population");

                System.out.printf("%4d: %-20s %3s %-15s %d \n", id, city, country, state, population);

            }

            // 3. close the connection
            connection.close();
        }
        catch(Exception e)
        {

        }

    }
}