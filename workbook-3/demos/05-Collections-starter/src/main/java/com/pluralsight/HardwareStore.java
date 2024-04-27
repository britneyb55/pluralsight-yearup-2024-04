package com.pluralsight;
import com.pluralsight.io.Logger;
import com.pluralsight.io.ProductLoader;
import com.pluralsight.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HardwareStore
{
    private ProductLoader productLoader = new ProductLoader();
    private Scanner userInput = new Scanner(System.in);
    private Logger logger = new Logger("application-events");

    private ArrayList<Product> products;
    private HashMap<Integer, Product> productMap;

    public HardwareStore()
    {
        logger.logMessage("application", "Start");
        products = productLoader.loadProducts();
        productMap = productLoader.loadProductMap();
    }

    public void run()
    {
        while(true)
        {
            int choice = displayHomeChoices();

            switch(choice)
            {
                case 1:
                    findProductByID();
                    break;
                case 2:
                    searchByCategory();
                case 3:
                    System.out.println("Goodbye");
                    return;
            }



        }

    }

    private void searchByCategory()
    {
        System.out.println();
        System.out.println("Search Product by category");
        System.out.println((" ").repeat(50));
        System.out.println("Enter category name: ");
        String category = userInput.nextLine();

        //java streams

        // orginal loop

//        for (Product product : products) {
//            if (product.getCategory().equalsIgnoreCase(category)) {
//                System.out.println("%d %-20s $ %.2f \n", product.getId(), product.getName(), product.getPrice());
//            }
//
//        }

//we are converting it into streat and converting in into a array list
        //arrow fuction or lambda expression
        List<Product> filteredProduct = products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .toList();

        for(Product product : filteredProduct)
        {
            System.out.println(" %d %-30s  $ %.2f \n", product.getId(), product.getName(), product.getPrice());
        }

        System.out.println();

    }

    private void findProductByID()
    {
        System.out.println();
        System.out.println("Find Product by ID");
        System.out.println((" ").repeat(50));
        System.out.println("Enter product id: ");

        int productId = Integer.parseInt(userInput.nextLine().strip());

//        //products
         Product product = productMap.get(productId);
//
////looping throught ALl products is not very efficiend
//        for(Product currentProduct : products)
//        {
//            if( currentProduct.getId() == productId)
//            {
//                product = currentProduct;
//                break;
//            }
//        }

        System.out.println();
        if (product != null)
        {

            System.out.println("Id:         " + product.getId());
            System.out.println("Category     " + product.getCategory());
            System.out.println("Name        " + product.getName());
            System.out.println("Price:     $" + product + getPrice());
        }
        else{
            System.out.println("Product" + productId + " was not found.");
        }
    }


    public int displayHomeChoices()
    {
        System.out.println();
        System.out.println("Gregor's Hardware Store:");
        System.out.println((" ").repeat(50));
        System.out.println("1) Search product by ID");
        System.out.println("2) Search by category");
        System.out.println("3) Exit");
        System.out.println();
        System.out.println("Please select an option: ");
        retrun Integer


    }
}
