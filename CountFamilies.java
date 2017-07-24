//Matt Raetano
//Write a program that counts the number of families whose income is below a certain level.
//Begin your program by asking the user to enter the number of families. Store this value in a variable called numOfFamilies.
//Next, create an array whose size is numOfFamilies. Then you will read numOfFamilies values, representing family incomes, from the keyboard and place them into the array.
//Next, find the maximum income of all the values entered, and print this value to the screen.
//Finally, count the families that make less than 10% of the maximum income. Display the income of each of these families, then display the count.  Make sure you use correct grammar (i.e. 1 family, 2 families).

import java.util.*;

public class CountFamilies {

	public static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {
		// declaring variables
		int numOfFamilies, max;
		double lowIncome;
		
		System.out.println("Please enter the number of families:");
		numOfFamilies = kbd.nextInt();

		// declaring array and size as variable
		int[] families = new int[numOfFamilies];
		
		// for loop to loop through and get the incomes of each family
		for(int i = 0; i < numOfFamilies; i++){
			System.out.print("Please enter an amount: $");
			families[i] = kbd.nextInt();
		}
		
		max = families[0];
		// for loop to find set the counter to find the max income
		for(int j = 0; j < numOfFamilies; j++){
			if(families[j] > max) {
				max = families[j];
			}
		}
		
		System.out.println( "\n" + "The maximum income is: $" + max);
		
		// setting a variable to find the incomes lower than 10%
		lowIncome = max * .1;
		
		System.out.println();
		System.out.println("The income of families making less than 10% of the maximum are:");
		
		int b = 0;
		// for loop to print the income less than 10% and the total number of families under
		for(int i = 0; i < numOfFamilies; i++){
			if(families[i] < lowIncome){
				System.out.println(families[i]);
				b = b + 1;
			}
		}
		
		if( b == 1){
			System.out.println("for a total of " + b + " family.");
		}
		else{
			System.out.print("for a total of " + b + " families.");
		}
	}
}
