package com.pluralsight;

public class MathApp
{
    public static void main(String[] args)
    {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1()
    {
        // Question 1:
        // declare variables here
        double bobSalary = 50.50;
        double graySalary = 100;
        double highestSalary;



        // code the logic to the problem here
        highestSalary = Math.max(bobSalary, graySalary);



        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The highest Salary is " + highestSalary);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here
        double carPrice= 2000.50;
        double truckPrice = 1000.50;
        double LowestPrice;


        // code the logic to the problem here
        LowestPrice = Math.min(carPrice, truckPrice);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The lowest Vehicle is " + LowestPrice);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here
        double radius = 7.25;
        double diameter;
        double Area;
        int exponent = 2;


        // code the logic to the problem here
        diameter = Math.pow(radius,exponent);
        Area = Math.PI * diameter;


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The Area of the circle is " + Area);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here
        double  Squaredvalue = 5.0;
        double squareRoot;

        // code the logic to the problem here
        squareRoot = Math.sqrt(Squaredvalue);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The square root of 5.0 is " + squareRoot);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here
        int point_onex = 5;
        int point_oney= 10;
        int point_twox= 85;
        int point_twoy= 50;
        int exponent = 2;
        int width;
        int hieght;

        double squarevalue_width;
        double squarevalue_hieght;
        double total;
        double distance;



        // code the logic to the problem here
        width = point_twox - point_onex;
        hieght = point_twoy - point_oney;
        squarevalue_width = Math.pow(width,exponent);
        squarevalue_hieght = Math.pow(hieght,exponent);
        total = squarevalue_hieght + squarevalue_width;
        distance = Math.sqrt(total);




        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The distance between the two points are: " + distance);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here
        double negativeNumber = -3.8;
        double positiveNumber;


        // code the logic to the problem here
        positiveNumber = Math.abs(negativeNumber);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The answer is " + positiveNumber);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7()
    {
        // Question 7:
        // declare variables here
        // randomNum returns a value between 0 - 1
        double randomNum;
        // create a random number between 1 and 100
        // double randomNum = Math.random()
        // double randomNumber = randomNum * 100; out 46.900...
        // converting it in an int is
        // int randomNumber = (int)(randomNum * 100);

        /* int loweEdge = 10;
        int highEdge = 20;
        int highEdgeTemp = highEdgeTemp - lowEdge;
        double seedValue = Math.random();
        int random = (int)((seedValue * highEdgeTemp) + lowEdge); */




        // code the logic to the problem here
        randomNum = Math.random();


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The random number between 0-1: " + randomNum);
    }
}