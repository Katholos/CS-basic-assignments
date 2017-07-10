//Matt Raetano
//Program will take an inputed integer and print each digit in reverse order
import java.util.*;

public class DigitReverse {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		int input;
		
		System.out.print("Please enter an integer: ");
		input = kbd.nextInt();
		int num1 = 0;
		//To convert the user input to positive if its negative
		input = Math.abs(-input);
		
		System.out.println("Your number in reverse order is: ");
		//While loop made to print out the modulus of the inputed integer by 10 with an if statement to print out the last digit needed
		while(input > 9){
			num1 = input % 10;
			input = input / 10;
			System.out.println(num1);
			if(input <= 9){
				System.out.println(input);
			}
		}
		
		kbd.close();
	}

}
