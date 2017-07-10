//Matt Raetano
//Program will take a phone number and record how many times a number appears
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