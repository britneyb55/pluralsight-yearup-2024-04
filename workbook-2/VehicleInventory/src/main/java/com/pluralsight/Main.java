package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        // create an array of vehicles here
        Vehicle[] vehicles =
                {
                        new Vehicle(101121, "ford Explorer", "red", 45000, 13500),
                        new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000),
                        new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700),
                        new Vehicle(101124, "Honda Civic", "White", 70000, 7500),
                        new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500),
                        new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000)
                };


        int choice = 0;
        while(choice != 6)
        {
            // print the home screen
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println();
            System.out.println("Enter your command");
            choice = Integer.parseInt(userInput.nextLine());

            switch(choice)
            {
                case 1:
                    // call the list all vehicles (pass the array)
                    listAllVehicles(vehicles);

                    break;
                case 2:
                    // call the search by make/model
                    searchByMakeModel(vehicles);
                    break;
                case 3:
                    // call the search by price
                    searchByPrice(vehicles);
                    break;
                case 4:
                    // call the search by color
                    searchByColor(vehicles);

                    break;
                case 5:
                    // add a vehicle
                    vehicles = addVehicle(vehicles);
                    System.out.println();
                    System.out.println("Vehicle has successfully been added to the list");
                    listAllVehicles(vehicles);
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid selection");
                    break;
            }
            System.out.println();
            System.out.println("Press Enter to continue...");
            userInput.nextLine();

        }


    }

    public static void listAllVehicles(Vehicle[] vehicles)
    {
        System.out.println();
        System.out.println("Vehicles available:");
        System.out.println("-------------------------------------------------------------------------");
        // loop through vehicles and print all
        for (int i=0; i < vehicles.length; i++)
        {
            Vehicle vehicle = vehicles[i];
            System.out.printf("%-8d %-16s %-6s %-6d %-8.2f \n",vehicle.getVehicleId(), vehicle.getMakeModel(),vehicle.getColor(),vehicle.getOdometerReading(),vehicle.getPrice());
        }

    }

    public static void searchByMakeModel(Vehicle[] vehicles)
    {
        // get user search criteria
        listAllVehicles(vehicles);
        System.out.println("Search for a vehicle by make or model:");
        String search = userInput.nextLine();

        // loop through vehicles and print only vehicles that match the search
        for(int i =0; i < vehicles.length; i++)
        {
            Vehicle vehicle = vehicles[i];

            if(vehicle.getMakeModel().equalsIgnoreCase(search))
            {
                System.out.println("Vehicle:");
                System.out.printf("%-8d %-16s %-6s %-6d %-8.2f \n",vehicle.getVehicleId(), vehicle.getMakeModel(),vehicle.getColor(),vehicle.getOdometerReading(),vehicle.getPrice());

            }

        }
    }

    public static void searchByPrice(Vehicle[] vehicles)
    {
        // get user search criteria
        listAllVehicles(vehicles);
        System.out.print("Enter your minimum price range from the list:");
        double minPrice = userInput.nextDouble();
        // loop through vehicles and print only vehicles that match the search
        System.out.println("Enter you maximum price:");
        double maxprice = userInput.nextDouble();

        for (int i=0; i < vehicles.length; i++)
        {
            Vehicle vehicle = vehicles[i];
            if(vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxprice )
            {
                System.out.printf("%-8d %-16s %-6s %-6d %-8.2f \n",vehicle.getVehicleId(), vehicle.getMakeModel(),vehicle.getColor(),vehicle.getOdometerReading(),vehicle.getPrice());

            }
        }
    }

    public static void searchByColor(Vehicle[] vehicles)
    {
        // get user search criteria
        listAllVehicles(vehicles);
        System.out.println("Enter a color from the list that you like:");
        String color = userInput.nextLine();

        // loop through vehicles and print only vehicles that match the search
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];

            if (vehicle.getColor().equalsIgnoreCase(color)) {
                System.out.println("Vehicle:");
                System.out.printf("%-8d %-16s %-6s %-6d %-8.2f \n", vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getOdometerReading(), vehicle.getPrice());

            }
        }
    }

    // bonus (optional)
    public static Vehicle[] addVehicle(Vehicle[] vehicles)
    {
        // get user input
        System.out.println("Enter a vehicle id:");
        long vehicleId = Long.parseLong(userInput.nextLine().strip());


        System.out.print("What model is the vehicle:");
        String makemodel = userInput.nextLine().strip();


        System.out.print("What is the color?");
        String color = userInput.nextLine().strip();

        System.out.print("What is the odometerReading?");
        int odomenterReading = Integer.parseInt(userInput.nextLine().strip());


        System.out.print("What is the price of the vehicle?");
        double price = Double.parseDouble(userInput.nextLine().strip());


        // create a vehicle
        Vehicle newvehicle = new Vehicle(vehicleId,makemodel,color,odomenterReading,price);


        // add it to the inventory
       


        // hint: you will need to create a new array that is 1 bigger than the old one
        //       then add the new vehicle in the last spot
        Vehicle[] tempArray = new Vehicle[vehicles.length+1];

        //copy
        System.arraycopy(vehicles,0,tempArray,0,vehicles.length);

        tempArray[vehicles.length] = newvehicle;

        vehicles = tempArray;

        return vehicles;
    }
}
