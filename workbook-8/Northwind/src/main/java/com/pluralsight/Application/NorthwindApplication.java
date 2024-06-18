package com.pluralsight.Application;

import com.pluralsight.models.Product;
import com.pluralsight.services.MYSqlProductDao;
import com.pluralsight.services.ProductsDao;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class NorthwindApplication
{
    Scanner in = new Scanner(System.in);
    DataSource dataSource;
    ProductsDao productDao;

    public NorthwindApplication()
    {
        this.dataSource = buildDataSource();
        productDao = new MYSqlProductDao(this.dataSource);
    }

    private DataSource buildDataSource()
    {
        try (FileInputStream stream = new FileInputStream("src/main/resources/config.properties"))
        {
            // first get the variables from the properties file
            Properties properties = new Properties();
            properties.load(stream);

            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // build a BasicDataSource object
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl(connectionString);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            return dataSource;

        }
        catch (IOException e)
        {
        }

        return null;
    }

    public void run()
    {
        while (true)
        {
            int selection = getUserChoice();

            switch (selection)
            {
                case 1 -> findProductById();
                case 2 -> findProductByCategories();
                default -> System.exit(0);

            }

        }
    }


    private int getUserChoice()
    {
        System.out.println();
        System.out.println("Here are your options");
        System.out.println("-".repeat(50));
        System.out.println(" 1. Get city by ID");
        System.out.println(" 2. Get product by Categories");
        return Integer.parseInt(in.nextLine().strip());
    }

    private void findProductById()
    {
        System.out.print("Enter a product id: ");
        int productId = Integer.parseInt(in.nextLine());

        Product product = productDao.getProductById(productId);

        displayProduct(product);

    }
    private void findProductByCategories()
    {
        System.out.print("Which category would you like to explore?");
        int categoryProductname = Integer.parseInt(in.nextLine());

        List<Product> products = productDao.getProductsByCategory(categoryProductname);

        System.out.println();
        products.forEach(product -> displayProduct(product));
    }




    private void displayProduct(Product product)
    {
        System.out.printf("%-10d  %-15s %-12d %-12d %-10.2f %-15d %-15d %-15d \n", product.getProductId(),product.getProductName(), product.getSupplierId(), product.getCategoryId(), product.getUnitPrice(), product.getUnitsInStock(), product.getUnitsOnOrder(), product.getReorderLevel());
    }
}
