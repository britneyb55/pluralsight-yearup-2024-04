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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            String sql = """
                 SELECT ProductID
                         ,ProductName
                 FROM northwind.Products;   
                 """;

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");

                System.out.printf("%3d  %-30s\n", id, productName);
            }

            connection.close();

        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }
    }
}