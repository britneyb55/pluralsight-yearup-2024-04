package com.pluralsight;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);
    private static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args)

    {
        loadproduct();

    }

    public static void loadproduct() {
        File file = new File("files/products.csv");

        try (Scanner fileScanner = new Scanner(file))
        {
            fileScanner.nextLine();
            String line = fileScanner.nextLine();
            String[] columns = line.split("[|]");

            String sku = columns[0];
            String name = columns[1];
            double price = Double.parseDouble(columns[2]);
            String department = columns[3];

            Product product = new Product(sku, name ,price,department);
            printProduct(product);
            products.add(product);

        }
        catch(IOException ex)
        {

        }

    }
    public static void printProduct(Product product)
    {
        System.out.printf(" %-6d %-20s %-4.2f \n",
                product.getSku(),
                product.getProductName(),
                product.getPrice(),
                product.getDepartment());
    }
}