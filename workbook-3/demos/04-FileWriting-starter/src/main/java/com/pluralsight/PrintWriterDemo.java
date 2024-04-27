package com.pluralsight;

import java.io.*;

public class PrintWriterDemo
{
    public static void main(String[] args)
    {
        String[] languages = {"Java", "C#", "JavaScript", "Python", "SQL"};
        String[] moreLanguages = {"HTML", "CSS", "Markdown", "JSON"};
        writeToFile(languages);
        writeToFile(moreLanguages);
    }

    public static void writeToFile(String[] words)
    {
        File file = new File("files/programming-languages-print-writer.txt");
        // FileWriter fileWriter = new FileWriter(file)-> create new file and overwrites the existing one

        //this allows use to append to the file if we want to add to the file by adding true
        //new FileWriter(file,true)-> opens existing file for appending
        try(FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fileWriter);
        )
        {
            for(String line : words)
            {
                //this gives us a lot of formating
                // works like System.out.printxxx()
                writer.println(line);

                //this have to do flush if i want to write immediately
                //this going to add it one an a time
                writer.flush();
            }
        }
        catch(IOException ex)
        {

        }
    }
}
