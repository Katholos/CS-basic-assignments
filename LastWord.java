//Matt Raetano
//Program takes a user-inputed line and returns the last word.
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
