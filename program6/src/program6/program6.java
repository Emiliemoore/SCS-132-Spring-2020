//Title: Program 6- Arrays
//Author: Emilie Moore
//Date: April 2, 2020
// Version: 1.0 
//Sport: Fishing for Dummies 
//How to play; A large pool 12' by 30' will be filled with 50 rainbow trout. The object of the game is to catch the most fish.
//How to play continued: However the player's hands will be tied behind their back. 


package program6; 
//Import additional code being used
import java.util.Scanner;
import java.util.Random;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare Variables
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random ();
		int teamOneTotal = 0; 
		int teamTwoTotal = 0; 
		String teamOne = "Team One:\t";
		String teamTwo = "Team Two;\t";
		
		//Prompt User for number of sections and create array 
		System.out.println ("How many sections do you want to play?");
		int sections = keyboard.nextInt();
		
		//Create the array
		int [][] scores = new int [2][sections];
		
		//LOOP ONE: Loop through columns first
		for (int col = 0; col< scores [0].length; col ++); 
		{
			for (int col = 0; col< scores.length; col++);
		
			// Random Info for Team One 
			if (col == 0)
			{
				//Random 
				scores [col][row] = randomNumber. nextInt(100);
				//Total 
				teamOneTotal += scores[col][row];
				//Add to our string 
				teamOne = teamOne + scores [col][row] + "\t";
			}
			
			//Random info For Team two 
			if (col == 1 )
			{
				scores [col][row] = randomNumber. nextInt(100);
				//Total 
				teamTwoTotal += scores[col][row];
				//Add to our string 
				teamTwo = teamTwo + scores [col][row] + "\t";
			}
			
		}// end of LOOP TWO

	}//end of LOOP ONE
	
	//output total scores
	System.out.println(teamOne + "= \t" + teamOneTotal);
    System.out.println(teamTwo + "=\t" + teamTwoTotal);
    
    if (teamOneTotal == teamTwoTotal)
    {
    	System.out.println("There was a tie!!");
    }
    else
    {
    	
    if (teamOneTotal > teamTwoTotal)
    	System.out.println("Team One is the Winner!!");
    else
    	System.out.println("Team Two is the Winner!!");
    }
}

}