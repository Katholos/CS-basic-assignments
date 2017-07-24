//Matt Raetano
//Write a program that gets a one-line sentence from the user, and then outputs one of several responses, as follows:
//If the sentence ends with a question mark '?' and the sentence contains an even number of characters, output to the screen the words: That's an even question.
//If the sentence ends with a question mark '?' and the sentence contains an odd number of characters, output to the screen the words: That's an odd question.
//If the sentence ends with an exclamation mark '!', output to the screen the word: Wow!
//For all other cases, output the words: You always say, " 
//followed by the sentence entered by the user. In your output, display double quotes around the user's sentence.
//When testing your program, make sure that you are checking for the correct conditions. For example, make sure your program still works correctly if there is a question mark in the middle of the sentence, rather than at the end.

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
