//Matt Raetano
//Program creates a word search puzzle for the user to use.

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
