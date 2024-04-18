package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Dice dice = new Dice();

        int dice1;
        int dice2;
        int addition;
        int count_2 = 0;
        int count_4 = 0;
        int count_6 = 0;
        int count_7 = 0;


        for(int i = 0; i < 100; i++)
        {
            dice1 = dice.roll();
            dice2 = dice.roll();

            addition = dice1 + dice2;

            //System.out.printf("roll %d: %d - %d Sum: %d \n", i,roll1,roll1,addition);

            if(addition == 2)
            {
                //System.out.printf("Roll 1: %d - %d Sum: %d ", roll1, roll2, addition);
                count_2++;

                continue;

            }

            if (addition == 4)
            {
               // System.out.printf("Roll 1: %d - %d Sum: %d ", roll1, roll2, addition);
                count_4++;

                continue;
            }

            if (addition == 6)
            {
               // System.out.printf("Roll 1: %d - %d Sum: %d ", roll1, roll2, addition);
                count_6++;

                continue;

            }

            if(addition == 7)
            {
                //System.out.printf("Roll 1: %d - %d Sum: %d ", roll1, roll2, addition);
                count_7++;
                continue;
            }

          System.out.printf("Roll %d: %d - %d Sum: %d \n", i, dice1, dice2, addition);
        }

        System.out.println();
        System.out.printf("sum of 2 is displayed %d \n", count_2);
        System.out.printf("sum of 4 is displayed %d \n", count_4);
        System.out.printf("sum of 6 is displayed %d \n", count_6);
        System.out.printf("sum of 7 is displayed %d \n", count_7);

    }
}