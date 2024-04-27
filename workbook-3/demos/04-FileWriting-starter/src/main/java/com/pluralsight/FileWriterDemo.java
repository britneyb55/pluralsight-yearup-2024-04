package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileWriterDemo
{
    public static void main(String[] args)
    {
        String[] languages = {"Java", "C#", "JavaScript", "Python", "SQL"};
        writeToFile(languages);
    }

    public static void writeToFile(String[] words)
    {
        //file object
        File file = new File("files/programming-languages.txt");

        //create a new FileWrite object
        // request the lock of the file system - that is why we put in in the try-block
        try(FileWriter writer = new FileWriter(file))
        {
            //loop
            for(String line : words)
            {
                // writer.write only adds the text to a buffer
                writer.write(line);
                writer.write("\n"); // adds a new line

                // writer.flush actually writes it to disk
                writer.flush();
            }

            // writer.close() is called automatically here
            // when the writer closes the buffer is automatically flushed
        }
        catch(IOException ex)
        {

        }
    }
}
