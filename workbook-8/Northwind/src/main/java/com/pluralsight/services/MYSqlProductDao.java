package com.pluralsight.services;

import com.pluralsight.models.Product;
import java.sql.SQLException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MYSqlProductDao implements ProductsDao
{
    private DataSource dataSource;

    public MYSqlProductDao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }


    @Override
    public Product getProductById(int id)
    {
        try(Connection connection = dataSource.getConnection())
        {

            // 2. execute a statement
            String sql = """
                    SELECT ProductID
                            , ProductName
                            , SupplierID
                            , CategoryID
                            , UnitPrice
                            , UnitsInStock
                            , UnitsOnOrder
                            , ReorderLevel
                      FROM Products
                      WHERE ProductID = ?;
                  """;



            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println();
            System.out.printf("%-10s %-15s %-12s %-12s %-10s %-15s %-15s %-15s%n",
                    "ProductID", "ProductName", "SupplierID", "CategoryID", "UnitPrice", "UnitsInStock", "UnitsOnOrder", "ReorderLevel");

            // 2 a. - read the results
            while(resultSet.next())
            {
                int productId = resultSet.getInt("ProductID");
                String Product_name = resultSet.getString("ProductName");
                int supplier = resultSet.getInt("SupplierID");
                int categoryID = resultSet.getInt("CategoryID");
                Double price = resultSet.getDouble("UnitPrice");
                int onStock = resultSet.getInt("UnitsInStock");
                int onOrder = resultSet.getInt("UnitsOnOrder");
                int reOrder = resultSet.getInt("ReorderLevel");

                Product product = new Product(productId,Product_name,supplier, categoryID, price, onStock, onOrder, reOrder);
                return product;
                //System.out.printf("%-12d  %-30s %-10.2f %-10d \n", productId, Product_name, price, onStock);
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return new Product();
//        System.out.println("Press enter to go back to homeScreen");
//        in.nextLine();
    }


    @Override
    public List<Product> getProductsByCategory(int category)
    {
        List<Product> products = new ArrayList<>();

        try(Connection connection = dataSource.getConnection())
        {
            String productsByCategory = """
                                    SELECT p.ProductID
                                            , p,ProductName
                                            , p.SupplierID
                                            , p,CategoryID
                                            , p,UnitPrice
                                            , p.UnitsInStock
                                            , p.UnitsOnOrder
                                            , p.ReorderLevel
                                    FROM Products AS p
                                    INNER JOIN Categories AS c
                                    ON p.CategoryID = c.CategoryID
                                    WHERE p.CategoryID = ?;
                                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(productsByCategory);
            preparedStatement.setInt(1, category);

            ResultSet resultSet = preparedStatement.executeQuery();


            while(resultSet.next())
            {
                int productId = resultSet.getInt("ProductID");
                String Product_name = resultSet.getString("ProductName");
                int supplier = resultSet.getInt("SupplierID");
                int categoryID = resultSet.getInt("CategoryID");
                Double price = resultSet.getDouble("UnitPrice");
                int onStock = resultSet.getInt("UnitsInStock");
                int onOrder = resultSet.getInt("UnitsOnOrder");
                int reOrder = resultSet.getInt("ReorderLevel");

                Product product = new Product(productId,Product_name,supplier, categoryID, price, onStock, onOrder, reOrder);
                products.add(product);
            }

        }
        catch(SQLException e)
        {

        }

        return products;
    }

    @Override
    public List<Product> getProductsByPrice(Double price) {
        return List.of();
    }
}
