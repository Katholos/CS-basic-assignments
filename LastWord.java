//Matt Raetano
//Write a JAVA application program that will get a line of text from the user, and then display the last word in the line.

import java.util.*;

public class LastWord {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = kbd.nextLine();
		
		int space = sentence.lastIndexOf(" ");
		int length = sentence.length();
		
		String word = sentence.substring(space, length);
		
		System.out.print("The last word in your sentence is:");
		System.out.println(word);
		
		kbd.close();
	}

}
