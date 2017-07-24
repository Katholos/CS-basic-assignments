//Matt Raetano
//Write a program that counts the number of times a digit appears in a telephone number.
//Your program should begin by creating an array of size 10 that will hold the count for each digit from 0 to 9. Next, read a telephone number from the keyboard. The telephone number should be stored in a String variable. Examine each character in the phone number, and increment the appropriate count in the array. Display the contents of the array.
//Note, the user might enter only numbers, as in: 2525551212
//or they might enter dashes between the digits, as in: 252-555-1212
//or they might enter parentheses and dashes, as in: (252)555-1212
//or they might enter parentheses, dashes and spaces, as in: (252) 555-1212
//Your program should be able to handle all of these possibilities.
//Hint: Ignore any character that isn't a digit.
//Hint: Use one of the Character methods to determine if a character is a digit or not.

import java.util.*;

public class CharacterFrequency {

	public static final int MAXSIZE = 10;
	
	public static Scanner kbd = new Scanner(System.in); 
	
	public static void main(String[] args) { 
		// declaring variables
		String digit, newDigit;
		long inputNumber;
	
		System.out.print("Please enter a 10-digit telephone number: ");
        
		//Taking inputNumber from the user  
		digit = kbd.nextLine();
		newDigit = digit.replaceAll( "[^\\d]", "" );
		
		//if statement for user error
		if(newDigit.length() != 10){
			System.out.println("ERROR: please enter a 10-digit telephone number!");
			System.exit(0);
		}
		
		inputNumber = Long.parseLong(newDigit);
		System.out.println(inputNumber);
	         
		//Creating an Array object to hold the frequency of corresponding digits
		long[] phoneNumber = new long[MAXSIZE];
	         
		while (inputNumber != 0) {
			//Get the lastDigit of inputNumber
			long lastDigit = inputNumber % 10;
	             
			//incrementing the lastDigit's count     
			phoneNumber[(int) lastDigit]++;
	        
			//Removing the lastDigit from inputNumber      
			inputNumber = inputNumber / 10;
		}
	         
		//Printing digits and their frequency
		System.out.println("The following is the number of times each digit appears:");    
	         
		for (int i = 0; i < phoneNumber.length; i++){
			System.out.println("The number " + i + " appears " + phoneNumber[i]);
		} 
	         
		kbd.close();
	}
}
