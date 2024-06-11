package com.pluralsight;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main
{
    public static void main(String[] args)
    {
        String username = "root";
        String password = "YUm15510n";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
                    username,
                    password);

            String sql = """
                    SELECT Id
                        , Name
                        , CountryCode
                    FROM city;
                 """;

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                String country = resultSet.getString("CountryCode");

                System.out.printf("%3d  %-30s %s\n", id, name, country);
            }

            connection.close();

        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }
    }
}