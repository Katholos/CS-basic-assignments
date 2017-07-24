//Matt Raetano
//Revise the program from the tutorial so that it multiplies three numbers together, rather than simply adding two numbers.
//Begin by copying the program code from the tutorial and pasting it into proper place in this new program file.
//The tutorial program prints messages to the screen telling the user that the program adds two numbers, and then tells them to enter two numbers. We need to change the first few print statements so they display the correct instructions to the user - that is, we need to be telling the user that the program multiplies three numbers, and tell them to enter three numbers.
//Add one more variable to the program to hold the extra number.
//Add the extra statement needed to get the additional number from the program's user and place it into the extra variable.
//Change the final message that is displayed to the screen so that it correctly says that it has multiplied three, and not added two numbers.
//Change the final System.out.println statement so that it performs the correct arithmetic.

import java.util.*;

public class MulThree {

	public static void main(String[] args) {

	Scanner kbd = new Scanner(System.in);
	//three ints for input, and one for the product so it can be printed on a single line
	int n1, n2, n3, ansr;

	System.out.println("Hello out there.");
	System.out.println("I will multiple three numbers for you.");
	System.out.println("Enter three whole numbers on a line:");

	n1 = kbd.nextInt();
	n2 = kbd.nextInt();
	n3 = kbd.nextInt();
	ansr = (n1 * n2 * n3);

	System.out.println("The product of those three numbers = " + ansr);
	
	kbd.close();

	}
}
