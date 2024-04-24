package com.pluralsight;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BedtimeStories
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        int fileName = 0;
        fileName = UserBedtimeStoryChoice();


        switch (fileName)
        {
            case 1:
                goldilocksBook();
                break;
            case 2:
                hanselAndGretel();
                break;
            case 3:
                marylittleLambBook();
                break;
            default:
                System.out.println("invalid selection");

        }

    }

    public static int UserBedtimeStoryChoice()
    {
        System.out.println("Bedtime Books:");
        System.out.println("1) goldilocks");
        System.out.println("2) Hansel and Gretel");
        System.out.println("3) Mary has a little lamb");
        System.out.println("Select a Bedtime Story to read by entering the number of (1-3):");
        int fileName = userInput.nextInt();
        return fileName;
    }

   public static void goldilocksBook()
   {
       System.out.println();
       System.out.println("Story of goldilocks");
       System.out.println();
       String filePath = "files/goldilocks.txt";

       File file = new File(filePath);

       // 2. I need a file reader to open the file (Scanner)
       try(Scanner fileScanner = new Scanner(file))
       {
               int lineNumber = 0;

               // 3. read the contents of the file
               while(fileScanner.hasNext())
               {
                   String line = fileScanner.nextLine();

                   lineNumber += 1;
                   System.out.println(lineNumber + " " + line);
               }

       }

       catch(FileNotFoundException ex)
       {
           System.out.println("That was a bad file name");
       }
   }


    public static void hanselAndGretel()
    {
        System.out.println();
        String filePath = "files/hansel_and_gretel.txt";
        System.out.println("Hansel and Gretel");
        File file = new File(filePath);

        // 2. I need a file reader to open the file (Scanner)
        try(Scanner fileScanner = new Scanner(file))
        {
            int linecount = 0;

            // 3. read the contents of the file
            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                linecount+= 1;
                System.out.println(linecount + " " + line);

            }

        }
        catch(FileNotFoundException ex)
        {
            System.out.println("That was a bad file name");
        }
    }

    public static void marylittleLambBook()
    {
        System.out.println();
        String filePath = "files/mary_has_a_little_lamb.txt";
        System.out.println("Mary has a little lamb");

        File file = new File(filePath);

        // 2. I need a file reader to open the file (Scanner)
        try(Scanner fileScanner = new Scanner(file))
        {
            int linecount = 1;

            // 3. read the contents of the file
            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                System.out.println(line);
                linecount++;

            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("That was a bad file name");
        }

    }


}
