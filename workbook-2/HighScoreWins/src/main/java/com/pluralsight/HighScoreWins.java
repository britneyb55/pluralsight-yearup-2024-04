package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;
//import javafx.util.Pair;


public class HighScoreWins{
    public static void main(String[] args)
    {
        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter the game score of both teams:");
        String teams_score_name = userinput.nextLine().strip();

//// "|" - pip it splits it in one letter each because it's a reserved character or
        // [:|] split
        String[] Split_word = teams_score_name.split("[:|]");

        String team1_name = Split_word[0];
        String team2_name = Split_word[1];
        int team1_score = Integer.parseInt(Split_word[2]);
        int team2_score = Integer.parseInt(Split_word[3]);
        String Winner = "";

        //Pair<String , Integer> myPair = new Pair<>(team1_name, team1_score);
       // String first = myPair.getKey();
       // Integer second = myPair.getValue();

       if (team1_score > team2_score)
       {
         Winner = team1_name;
       }
      else if (team2_score > team1_score)
      {
         Winner = team2_name;
      }
       else
       {
          Winner = "tie";
       }

        System.out.println("Winner: " + Winner);



    }
}