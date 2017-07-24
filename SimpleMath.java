//Matt Raetano
//Write a Java application program that reads two floating point numbers from the keyboard, and then prints their sum, difference, and product.
//Your program should perform the following steps, in this order:
//Print a prompt to the screen telling the user that you want him/her to enter two real numbers. 
//Get the two numbers from the keyboard and store them into two floating point variables in your program.
//Perform your calculations. Store the answer to each calculation in a separate floating point variable.
//Print out the three answers to the screen. Before each answer, be sure to print a simple message to the user so they will know what the number means.
//In total, you will need five floating point variables, and one keyboard object variable for this program. Make sure you choose names for your variables that indicate what the variables might be holding.

import java.util.*;

public class SimpleMath {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		float n1, n2, sum, diff, prod;
		
		System.out.println("Please enter two numbers:");
		n1 = kbd.nextFloat();
		n2 = kbd.nextFloat();
	
		sum = n1 + n2;
		diff = n1 - n2;
		prod = n1 * n2;
	
		System.out.println("The sum of your numbers is " + sum );
		System.out.println("The difference of your numbers is " + diff );
		System.out.println("The product of your numbers is " + prod );

		kbd.close();
	
	}

}
