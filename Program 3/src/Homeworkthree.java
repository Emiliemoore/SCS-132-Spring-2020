// Project: Program 3           
// Author: Emilie Moore                   
// Date: February 19, 2020                
// Git User: Emiliemoore                  
import java.util.Scanner;

public class Homeworkthree{
	

	public static void main(String[] args) { 
		
	// TODO Auto-generated method stub               
    
	// Activate Scanner/keyboard                     
	Scanner keyboard = new Scanner(System.in);      
	
	//Declaring Variables 
	int favoriteNumber;
	String firstName; 
	
	//Collect User Input 
	System.out.println("What is your favorite number?  ");
	favoriteNumber = keyboard.nextInt();
	System.out.println("What is your first name?  ");
	firstName = keyboard.next(); 
	
	//Constructing while loop 
	System.out.print("Enter a number in the " + " range of 0 through 100: ");
	favoriteNumber = keyboard.nextInt();
	
	//Validate the input
	
	while (favoriteNumber < 0 || favoriteNumber > 100)
	{
			System.out.println ("Please select a new number");
			favoriteNumber = keyboard.nextInt();
			
		
		}
		
		System.out.println("Thank you for your input " + firstName );

	//for loop 
	for(int countDown = favoriteNumber; countDown >= 0; countDown--)
	{
	System.out.println("your favorite number is " + favoriteNumber);
	System.out.println("You have" + countDown + "left.");
	
	}
	
	
	}
	
			
}
