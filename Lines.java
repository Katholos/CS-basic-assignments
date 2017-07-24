// Matt Raetano
// Write a program that will display a series of asterisks across the screen. The number of asterisks that you should print will be entered by the user.
//You should begin the program by asking the user how many asterisks to print. After retrieving this number, your program should print the requested number of asterisks, all on the same line. Make sure that the "line-break" character is printed after the last asterisk.

import java.util.*;

public class Lines {
	
	public static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) {
		// declared values
		int arr_length;
		
		System.out.print("Please enter how many units long you want your line to be: ");
		arr_length = kbd.nextInt();
		
		// calling the method with the parameter
		System.out.println(printLine(arr_length));
		
		kbd.close();
	}
	
	/**
	 * Method prints the contents of a char array
	 * @param arr_length an inputed amount that is the size of the array
	 */
	public static char[] printLine(int arr_length){
		char f  = '*';
		char[] array_line = new char[arr_length];
		for( int i = 0; i < array_line.length; i++){
			array_line[i] = f;
			
		}
		return array_line;
		//System.out.println(array_line);
		// extra line break
		//System.out.println();
	}
	
}
