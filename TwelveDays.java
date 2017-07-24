//Matt Raetano
//Write a java application program that will print the verses of the song The Twelve Days of Christmas to the screen. In this song, each verse adds one additional line of output to the song.
//After each verse is printed, ask the user to press "Enter" to continue.This will allow your program to pause after each verse to give the user time to read the verse before moving on to another.
//You should NOT ask the user to press "Enter" after the last verse.
//You CANNOT write tons of print statements to simply print out the entire song.
//Your program MUST include a loop. The loop should be designed to repeat exactly 12 times. Each trip through the loop should print one verse to the screen.
//Inside the loop, you MUST use a switch statements to control the lines that are printed to the screen.
//For the statement "On the Xth day of Christmas my true love gave to me":
//Begin by printing "On the X" where X is the value of your loop counter.
//Next, use a switch statement to print "st" or "nd" or "rd" or "th" to the screen. At this point, depending on the value of the loop counter, this will cause one of the following lines to be printed: 
//On the 1st 
//On the 2nd 
//On the 3rd 
//On the 4th 
//etc.
//Now, print the rest of the line to the screen: 
//" day of Christmas my true love gave to me"
//After the first line has been printed, use another switch statement to control which lines of the verse are printed to the screen. Each case statement is allowed to contain a single println statement so that each case statement is printing a single line of output to the screen.

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
