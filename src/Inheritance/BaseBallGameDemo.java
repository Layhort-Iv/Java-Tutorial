package Inheritance;

import java.util.Arrays;
import java.util.Scanner;

class BaseballGame
{
    // declare the instance variables to hold the team 1 and team 2 name
    protected String name_team_One, name_team_Two;

    // int array to hold the team 1 scores
    protected int[] team_OneScores;
    // int array to hold the team 2 scores
    protected int[] team_TwoScores;

    // set the initial inning number of each team to 1
    protected int inningsNumber_1, inningsNumber_2;


    public BaseballGame()
    {
        final int innings = 9;
        // initialize the class instances with the parameter values
        team_OneScores = new int[innings];
        team_TwoScores = new int[innings];
        // populate both the arrays to -1
        for (int i = 0; i < innings; ++i)
        {
            team_OneScores[i] = -1;
            team_TwoScores[i] = -1;
        }

        // set the initial inning number of each team to 1
        inningsNumber_1 = 1;
        inningsNumber_2 = 1;
    }

    // getter and setter method to store/retrieve name of the team 1
    public String getName_Team_One()
    {
        return name_team_One;
    }
    public void setName_Team_One(String team_One)
    {
        this.name_team_One = team_One;
    }

    // getter and setter method to store/retrieve name of the team 2
    public String getName_Team_Two()
    {
        return name_team_Two;
    }

    public void setName_Team_Two(String team_Two)
    {
        this.name_team_Two = team_Two;
    }

    // helper method to display the error message
    protected void displayErrorMessage(int currentInning, int userInnings)
    {
        if (currentInning < userInnings)
        {
            System.out.println("Error!!!. Previous to " + userInnings + " inning's values are not set..");
        }
        else
        {
            System.out.println("Error!!!. All ready the " + userInnings + " inning's values are set..");
        }
    }

    // getTeam_OneScores() to retrieve all the scores of the team 1
    public int[] getTeam_OneScores()
    {
        return team_OneScores;
    }

    // getTeam_OneScores() overloaded method to retrieve the scores of the team 1 from the given innings
    public int getTeam_OneScores(int inning)
    {
        // check whether the given inning number is with in the limit
        if (inning - 1 >= 0 && inning - 1 < team_OneScores.length)
        {
            // if the condition is satisfied, then return the inning score of the team 1
            return team_OneScores[inning - 1];
        }

        // otherwise, just return -1
        else
        {
            return -1;
        }
    }

    // to set the score of the inning for the team 1
    public void setTeam_OneScores(int inning, int score)
    {
        // check whether the inningNumber_1 is equal to the value of parameter inning
        if (inningsNumber_1 == inning)
        {
            // if satisfied then set the score
            team_OneScores[inning - 1] = score;

            // increment the inningNumber_1
            inningsNumber_1++;
        }

        // otherwise, display the error message
        else
        {
            displayErrorMessage(inningsNumber_1, inning);
        }
    }

    // getTeam_TwoScores() to retrieve all the scores of the team 2
    public int[] getTeam_TwoScores()
    {
        return team_TwoScores;
    }

    // getTeam_TwoScores() overloaded method to retrieve the scores of the team 2 from the given innings
    public int getTeam_TwoScores(int inning)
    {
        // check whether the given inning number is with in the limit
        if (inning - 1 >= 0 && inning - 1 < team_TwoScores.length)
        {
            // if the condition is satisfied, then return the inning score of the team 1
            return team_TwoScores[inning - 1];
        }

        // otherwise, just return -1
        else
        {
            return -1;
        }
    }

    // to set the score of the inning for the team 2
    public void setTeam_TwoScores(int inning, int score)
    {
        // check whether the inningNumber_2 is equal to the value of parameter inning
        if (inningsNumber_2 == inning)
        {
            // if satisfied then set the score
            team_TwoScores[inning - 1] = score;

            // increment the inningNumber_2
            inningsNumber_2++;
        }

        // otherwise, display the error message
        else
        {
            displayErrorMessage(inningsNumber_2, inning);
        }
    }

    // getGameWinner() which computes the game winner and returns the string value of the winner.
    public String getGameWinner()
    {
        // declare the required variables
        String winner = "\n";
        int total_Team_One = 0;
        int total_Team_Two = 0;

        // check whether all the innings scores are entered successfully
        if (inningsNumber_1 - 1 == team_OneScores.length && inningsNumber_2 - 1 == team_TwoScores.length)
        {

            // loop to compute the total scores of two teams
            for (int i = 0; i < team_OneScores.length; ++i)
            {
                total_Team_One += team_OneScores[i];
                total_Team_Two += team_TwoScores[i];
            }

            // set the scores of two teams
            winner += "Team " + name_team_One + " score: " + total_Team_One + "\n";
            winner += "Team " + name_team_Two + " score: " + total_Team_Two + "\n\n";

            // condition to check whether team 1 win the game or not
            if (total_Team_One > total_Team_Two)
            {
                // if team 1 wins then set the string value
                winner += "Team " + name_team_One + " wins the Baseball Game";
            }

            // condition to check whether team 1 win the game or not
            else if (total_Team_Two > total_Team_One)
            {
                // if team 1 wins then set the string value
                winner += "Team " + name_team_Two + " wins the Baseball Game";
            }

            // set the draw/tie information
            else
            {
                winner += "Draw between " + name_team_One + " and " + name_team_Two + " teams.";
            }

            // return the winner content
            return winner;
        }

        // otherwise, return some information.
        return "Still more innings are left...";
    }
}

public class BaseBallGameDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.setName_Team_One("AA");
        baseballGame.setName_Team_Two("BB");

        System.out.println(baseballGame.getName_Team_One());
        System.out.println(baseballGame.getName_Team_Two());

        System.out.println("\nEnter all team one scores");
        for(int i=1; i<=9; i++){
            baseballGame.setTeam_OneScores(i, sc.nextInt());
        }
        System.out.println("Enter all team two scores");
        for(int i=1; i<=9; i++){
            baseballGame.setTeam_TwoScores(i, sc.nextInt());
        }

        System.out.println(Arrays.toString(baseballGame.getTeam_OneScores()));
        System.out.println(Arrays.toString(baseballGame.getTeam_TwoScores()));

        System.out.println(baseballGame.getTeam_OneScores(2));
        System.out.println(baseballGame.getTeam_TwoScores(2));

        System.out.println(baseballGame.getGameWinner());
    }
}
