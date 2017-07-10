//Matt Raetano
//Program will convert an inputed Celsius or Fahrenheit temp. to the other.
import java.util.*;

public class TempConverter {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Enter a temperature: ");
		float num1 = kbd.nextFloat();
		kbd.nextLine();
		System.out.print("Enter (C)elsius or (F)ahrenheit: ");
		char char1 = kbd.next().toUpperCase().charAt(0);
		
		if(char1 == 'F'){ 
			num1 = (float) ((num1-32.0)*(5.0/9.0));
			System.out.println("The equivalent temperature in Celsius is: " + num1);
		} else {
			if(char1 == 'C'){ 
				num1 = (float) ((num1* (9.0/5.0)) + 32.0);
				System.out.println("The equivalent temperature in Fahrenheit is: " + num1);
			}else {
				System.out.println("ERROR: Please enter a 'C' or an 'F'");	
				System.exit(0);
			}
		}
		
		kbd.close();
	}

}
