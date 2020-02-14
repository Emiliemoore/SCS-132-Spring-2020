import java.util.Scanner;

// Project: Switch Statements 
// Author: Emilie Moore
// Date: February 13, 2020
// Git User: Emiliemoore

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Activate Scanner/keyboard 
		Scanner keyboard = new Scanner(System.in);
		
		// Declaring Variables
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		
	//Collect User Input 
	System.out.println("What is your First Number?");
	firstNumber = keyboard.nextInt();
	System.out.println("What is your Second Number?");
	secondNumber = keyboard.nextInt();
	System.out.println("What is your third Number?");
	thirdNumber = keyboard.nextInt();
	
	
	
	// Menu 
	System.out.println("Main Menu");
	System.out.println("\t1.) Add");
	System.out.println("\t2.) Subtract");
	System.out.println("\t3.) Multiply");
	System.out.println("\t4.) Comparing Numbers");
	System.out.println("\t5.) Exit");
	System.out.print("Please select menu choice ");
	
	//Placeholder to ask for user input later 
			int menuChoice = keyboard.nextInt();
			switch (menuChoice) {
			
			
			case 1: 
			System.out.println("Addition");
			System.out.println(firstNumber + " + 3 = " + (firstNumber+3));
			System.out.println(secondNumber + " + 10 = " + (secondNumber+10));
			System.out.println(thirdNumber + " + 4 = " + (thirdNumber+4));
			break; 
			case 2:
			System.out.println("Substraction"); 
			System.out.println(firstNumber + " minus 5 = " + (firstNumber - 5));
			break; 
			case 3: 
			System.out.println("Mulitplication");
			System.out.println(firstNumber + " * 2 =" + (firstNumber * 2));
		
			break;
			case 4: 
				System.out.println("Comparing Numbers");
	
				if (thirdNumber > secondNumber)
				System.out.println(thirdNumber  + " is greater than " + secondNumber);
				
				if (secondNumber < thirdNumber)
				System.out.println(secondNumber  + " is less than " + thirdNumber);
				
			case 5:
			System.out.println("Exit Menu");
			break;
			default: 
			System.out.println("Have a great day");
			
				
	}

}}