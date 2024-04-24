package com.pluralsight;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)

    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the nameif the file:");
        String fileName = userInput.nextLine();

        //1. I need a file object that point to the text file.
        //we cannt read a file without an expection of try and block
        // path to the file
       String filePath = "file/mary_had_a_little_lamb.txt";

       //file object help you create a file
       File file = new File(filePath);

       //information that I can get out from the file path
        // see information
        //file can be a folder or directory

        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());


        // read from a file
        // scanner opens the stream for us
        //  2. I need a file reader to opene th ef file (Scanner)
        try(Scanner fileScanner = new Scanner(file))
        {
            //3. read the contents of the file
            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                System.out.println(line);
                word count;
            }

        }catch(FileNotFoundException ex)
        {
            System.out.println("Bad file name");
        }
        // fileScanner.close() has already been called




    }
}