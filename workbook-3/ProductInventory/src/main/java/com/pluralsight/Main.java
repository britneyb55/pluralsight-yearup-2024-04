package com.pluralsight;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;



public class Main
{
    //Arraylist auto grows
    private static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args)
    {
        loadProducts();

        System.out.println("there are " + products.size() + " products");

        for (int i =0; i < products.size(); i++)
        {
            Product product = products.get(i);
            System.out.println(product.getName());
        }


    }

    public static void loadProducts()
    {
       //1. create a file with the path to the actual file
        File file = new File("files/products.csv");

        //2. open the file using a Scanner
        try(Scanner fileScanner = new Scanner(file))
        {
            //skip the first Line - becuase it is a header line
            fileScanner.nextLine();

            //3. loop thorught each line in the file
            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();

                //split the line on a | (pipe)
                String[] columns = line.split("[|]");


                //get the specific variables
                String sku = columns[0];
               String name = columns[1];
               double price = Double.parseDouble(columns[2]);
                String department = columns[3];

                //create a new product from the current line
                Product product = new Product( sku,name,price , department);

                //add the new producct to the products Arraylist
                products.add(product);

            }

        }
        catch(IOException ex)
        {

        }
    }
}