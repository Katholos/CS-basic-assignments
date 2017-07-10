//Matt Raetano
//Program gets a one-line sentence from the user, and then outputs one of several responses
import java.util.*;

public class SentenceProcessor {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter a sentence or question.");
		//Declared a string variable for user input
		String sentence = kbd.nextLine();
		//declared an int variable for the length of the string quantified
		int length = sentence.length();
		//declared a char to use in the if statement
		char end = sentence.charAt(length-1);
		
		//If statement to check the end the last char of the inputed string and print the correct response
		if(end == '?'){
			if (length % 2 == 0){
				System.out.println("Thats an even question.");
			}
			else { 
				System.out.println("Thats an odd question.");
			}
		}	
		else if(end == '!'){
			System.out.println("Wow!");
		} 
		else {
			System.out.println("You always say, " + "\"" + sentence + "\"");
		}
		
		kbd.close();
	}
}
