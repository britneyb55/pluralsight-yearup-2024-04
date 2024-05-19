package com.pluralsight.services;

import com.pluralsight.models.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class shapesFile {

    public static ArrayList<Shape> loadShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("data/shapes.csv")))
        {

            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] columns = line.split("\\|");

                String type = columns[0];

                switch (type.toLowerCase())
                {
                    case "circle":
                        int radius = Integer.parseInt(columns[1]);
                        Shape circle = new Circle(radius);
                        shapes.add(circle);
                        break;

                    case "rectangle":
                        int width = Integer.parseInt(columns[1]);
                        int height = Integer.parseInt(columns[2]);
                        Shape rectangle = new Rectangle(width, height);
                        shapes.add(rectangle);
                        break;

                    case "square":
                        int sides = Integer.parseInt(columns[1]);
                        Shape square = new Square(sides);
                        shapes.add(square);
                        break;
                    case "triangle":
                        int base = Integer.parseInt(columns[1]);
                        int height1 = Integer.parseInt(columns[2]);
                        Shape triangle = new Triangle(base, height1);
                        shapes.add(triangle);
                        break;
                    default:
                        break;

                }

            }

        } catch (IOException e) {

        }
        return shapes;
    }
//    public static void saveShapes(ArrayList<Shape> shapes)
//    {
//        try(PrintWriter writer = new PrintWriter(new File("data/shapes.csv")))
//        {
//
//            for (Shape shape: shapes)
//            {
//                if (shape instanceof Circle)
//                {
//                    String type = "circle";
//                    writer.printf("%s|%d\n", type, shape.getClass());
//                }
//
//
//                System.out.println(shape);
//            }
//
//        }
//        catch (IOException e)
//        {
//        }
//    }



}

