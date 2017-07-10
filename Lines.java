// Matt Raetano
// Program will manipulate a partial array and a method to print a line however long that user wants
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
