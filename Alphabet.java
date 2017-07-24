//Matt Raetano
//Write a java application program that will print the uppercase letters of the English alphabet to the screen, all on one line, each one separated by a space.
//The output of this program should look like this:
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
//This program always produces the same result every time it is executed. This program does not get any values from the keyboard, and therefore does NOT need an import statment, and does NOT need a "Scanner keyboard" line to set up the keyboard.

public class Alphabet {

	public static void main(String[] args) {
		
		char myVariable = 'A';
		
		//Loop created that if the int equivalent to char 'A' is less than 'Z' loop through it.
		while(myVariable < 91){
			System.out.print(myVariable + " ");
			myVariable++;
		}
	
	}
}
