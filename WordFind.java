//Matt Raetano
//Write a Java application program that will create and display a very simple word find puzzle.
//Begin by asking the user to enter three-letter word, a four-letter word, a five-letter word and another four-letter word (in that order!). Store each word in a separate String variable.
//Once the user has entered all four items, use the appropriate String method to change the user's items to all uppercase letters.
//Next create the word find puzzle according to the following rules:
//Add the letters "WQTLK" to the beginning of the first word.
//Add the letters "RXM" to the beginning of the second word.
//Add the letter "P" to the end of the second word.
//Add the letter "F" to the beginning of the third word.
//Add the letters "MB" to the end of the third word.
//Add the letters "QYLA" to the end of the fourth word.
//Once the entire puzzle has been assembled, display the puzzle to the screen.

import java.util.*;

public class WordFind {

	public static void main(String[] args) {
	
			Scanner kbd = new Scanner(System.in);
			
			System.out.print("Enter a three-letter word: ");
			String word1 = kbd.next();
			System.out.print("Enter a four-letter word: ");
			String word2 = kbd.next();
			System.out.print("Enter a five-letter word: ");
			String word3 = kbd.next();
			System.out.print("Enter another four-letter word: ");
			String word4 = kbd.next();
			
			String puzzle = ("\n" + "WQTLK" + word1.toUpperCase() + "\n" + "RXM" + word2 .toUpperCase() + "P" + "\n" + "F" + word3.toUpperCase() + "MB" + "\n" + word4.toUpperCase() + "QYLA");
			System.out.println("Here is your word find puzzle: " + puzzle);
			
			kbd.close();
	}
}
