//Matt Raetano
//Program will print out the verses of the twelve days of christmas using loops
import java.util.*;

public class TwelveDays {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		//String statements to be used with the switch statement
		String next = null;
		String suffix = "st";
		String line1 = "A patridge in a pear tree.";
		String line2 = "Two turtle doves, and";
		String line3 = "Three french hens,";
		String line4 = "Four calling birds,";
		String line5 = "Five golden rings,";
		String line6 = "Six geese a laying,";
		String line7 = "Seven swans a swimming,";
		String line8 = "Eight maids a milking,";
		String line9 = "Nine ladies dancing,";
		String line10 = "Ten lords a leaping,";
		String line11 = "Eleven pipers piping,";
		String line12 = "Twelve drummers drumming,";
		
		System.out.println("Hello, here is the first verse of the 12 days of Christmas: " + "\n");
		
		//Program said to use only 1 print statement in a case, so i looped through the switch statement with one
		for(int x = 1; x < 13; x++){ 
			System.out.println("On the " + x + suffix + " day of Christmas my true love gave to me");
			switch(x){
			case 1:	
				System.out.println(line1);
				suffix = "nd";
				break;
			case 2:
				System.out.println(line2 + "\n" + line1);
				suffix = "rd";
				break;
			case 3:
				System.out.println(line3 + "\n" + line2 + "\n" + line1);
				suffix = "th";
				break;
			case 4:
				System.out.println(line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
			case 5:
				System.out.println(line5 + "\n" + line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
			case 6:
				System.out.println(line6 + "\n" + line5 + "\n" + line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
			case 7:
				System.out.println(line7 + "\n" + line6 + "\n" + line5 + "\n" + line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
			case 8:
				System.out.println(line8 + "\n" + line7 + "\n" + line6 + "\n" + line5 + "\n" + line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
			case 9:
				System.out.println(line9 + "\n" + line8 + "\n" + line7 + "\n" + line6 + "\n" + line5 + "\n" + line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
			case 10:
				System.out.println(line10 + "\n" + line9 + "\n" + line8 + "\n" + line7 + "\n" + line6 + "\n" + line5 + "\n" + line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
			case 11:
				System.out.println(line11 + "\n" + line10 + "\n" + line9 + "\n" + line8 + "\n" + line7 + "\n" + line6 + "\n" + line5 + "\n" + line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
			case 12:
				System.out.println(line12 + "\n" + line11 + "\n" + line10 + "\n" + line9 + "\n" + line8 + "\n" + line7 + "\n" + line6 + "\n" + line5 + "\n" + line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
				break;
				
			}
			
			System.out.println("\n" + "Would you like to Continue? Press ENTER");
			next = kbd.nextLine();
			//If statement with a null next string to continue after the user presses enter
			if(next.isEmpty()){
			}
			else
				System.exit(0);
			
		}
		
		kbd.close();
	}

}
