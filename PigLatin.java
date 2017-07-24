//Matt Raetano
//Write a java application that acts as a one-word Pig Latin translator. Your program should:
//ask the user to enter a word
//convert the entered word into proper Pig Latin translation
//print the translated word on the screen

import java.util.*;

public class PigLatin {
	
	public static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) {
		String input;

		System.out.print("This program will translate a word into pig latin, please enter a word: ");
		
		input = kbd.nextLine().toLowerCase();
		
		System.out.println(translate(input));
		//System.out.println(findPos(input));
		
		kbd.close();
	}
	/**
	 * This method translates a user inputed word into pig latin
	 * @param input is a parameter that comes from the user inputed from the main
	 * @return returning the input so its easier to read 
	 */
	public static String translate(String input){
		// intializing variables
		int length = input.length();
		String sub = input.substring(0, findPos(input));
		String sub2 = input.substring(findPos(input), length);
		
		// char array for the the first rule
		char[] word = input.toCharArray();
		// if statement to divide up the three rules.
		if((word[0] == 'a') || (word[0] == 'e') || (word[0] == 'i') || (word[0] == 'o') || (word[0] == 'u'))
			input = input + "way";
		else if((!input.contains("a")) && (!input.contains("e")) && (!input.contains("i")) && (!input.contains("o")) && (!input.contains("u")))
			input = input + "ay";
		else 
			input = (sub2 + sub + "ay");
		
		return input;

	}
	/**
	 * method is used for the third rule
	 * @param input same parameter for the other methods, easier to read
	 * @return returning the position of the first vowel, to be used in a substring
	 */
	public static int findPos(String input){
	    String loweredWord = input.toLowerCase();
	    String vowels = "aeiouy";

	    for (int index = 0; index < loweredWord.length(); index++){
	        if (vowels.contains(String.valueOf(loweredWord.charAt(index)))){
	            return index;
	        }
	    }
	    return -1;
	}
	
}
