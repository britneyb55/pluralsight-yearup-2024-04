package com.pluralsight;

import com.pluralsight.models.Shape;

import java.util.ArrayList;


import static com.pluralsight.services.shapesFile.loadShapes;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = loadShapes();
        for (Shape shape : shapes)
        {
            System.out.println(shape);
        }


        // load all shapes into the arraylist

        // then print the toString() of each shape
//        for (Shape shape: shapes)
//        {
//            System.out.println(shape);
//        }
    }
}