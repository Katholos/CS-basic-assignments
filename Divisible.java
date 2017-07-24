//Matt Raetano
//Write a program that asks the user to enter two integers. The program should test to see if the first number is divisible by the second number.

import java.util.*;

public class Divisible {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num1 = kbd.nextInt();
		System.out.print("Enter another integer: ");
		int num2 = kbd.nextInt();
		
		int output = num1 % num2;
		
		if (output == 0) {
			System.out.println(num1 + " is divisible by " + num2);
		}else {
			System.out.println(num1 + " is not divisible by " + num2);
		}
		
		kbd.close();
		
	}

}
