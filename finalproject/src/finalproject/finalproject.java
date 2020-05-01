// Project: Final Project
// Author: Emilie Moore
// Date: April 27, 2020
// Git User: Emiliemoore

package finalproject;
import java.text.DecimalFormat;
import java.util.Scanner;

public class finalproject {
public static void main(String[] args) {
		
//Setup and Declaring Variables
		Scanner input= new Scanner(System.in); 
		DecimalFormat df = new DecimalFormat("0.00"); 
		double subTotal= 0; 
		double total =0;
		int Selection=0; 
		int crabCount=0; 
		int pastaCount=0; 
		int steakCount=0; 
		int chickenCount=0; 
		int sandwichCount=0; 
		double crab=28.99; 
		double pasta=15.99; 
		double steak=19.95; 
		double chicken=12.99; 
		double sandwich=8.99; 
		byte itemsNumber = 0; 
		double tax = 0; 
		double taxes = 0.07; 
		double totalFinal = 0;
		
				
	do { 
		
// Menu Input  
	System.out.println("Welcome to BLUE MERMAID"); 
	System.out.println(" 1) Crab Cakes $" + crab);
	System.out.println(" 2) Pasta $" + pasta);
	System.out.println(" 3) Steak $" + steak);
	System.out.println(" 4) Chicken $" + chicken);
	System.out.println(" 5) Sandwich $" + sandwich); 
	if (Selection !=0){ 
	System.out.println(" 0) Finish Order");
	}
	System.out.println ("Current Subtotal $" + (df.format(total)));
	System.out.print("Please make your selection: "); 
	Selection = input.nextInt(); 
	
// Computation of Menu Selection
	if (Selection > 5 || Selection <0){ 
		System.out.println("Please enter a different choice");
		
		
}else 
	if (Selection == 1){
		subTotal =crab; 
		++crabCount;
		++itemsNumber; 
		total = total + subTotal;
//While Loop 
	while (crabCount <= 1)
	{
		System.out.println("You have selected Crab Legs"); 
	}
	
	
		
	}
	if (Selection == 2) {
		subTotal = pasta; 
		++pastaCount; 
		++itemsNumber; 
		total = total + subTotal; 
//For Loop 
	for (Selection = 2; Selection <=2; Selection += 2)
         System.out.println("You have selected pasta");
	
		
	} 
	if (Selection == 3) { 
		subTotal = steak;
		++steakCount;
		++itemsNumber; 
		total = total + subTotal; 
		
	} 
	if (Selection == 4) { 
	subTotal = chicken;
	++chickenCount; 
	++itemsNumber; 
	total = total + subTotal; 
	
	{
	if (Selection == 5) {
	subTotal = sandwich;
	++sandwichCount; 
	++itemsNumber; 
	total = total + subTotal; 
	
	}
	}while (Selection !=0);
	
// Final Output  
	tax = (total*taxes);
	totalFinal = total+tax;
	if (crabCount != 0){
	System.out.println(crabCount+" Crab Legs");
	}if (pastaCount != 0){
	System.out.println(pastaCount+" Pasta"); 
	}if (steakCount !=0){ 
	System.out.println(steakCount+" Steak");
	}if (chickenCount !=0){
	System.out.println(chickenCount+" Chicken with vegtables");
	}if (sandwichCount !=0){ 
	System.out.println(sandwichCount+" Sandwich with fries");
	}
	System.out.println("Order: " + itemsNumber +" Items"); 
	System.out.println("Subtotal: $" + (df.format(total))); 
	System.out.println("Tax (7%): $"+ (df.format(tax))); 
	System.out.println("Total: $ " + (df.format(totalFinal))); 
	System.out.println("Thank you for visiting BLUE MERMAID, please come again!");

	}

}
