//Matt Raetano
//Write a program that allows the user to convert a temperature given in degrees Celsius or Fahrenheit to the opposite value.
//Begin by getting a temperature from the user. After the temperature, ask the user to enter "C" or "c" for Celsius or "F" or "f" for Fahrenheit. If the user enters anything other than "C" or "F", then display an error message telling the user to only enter "C" or "F".
//Once you have a temperature and the unit, then convert the temperature to the opposite unit and display the result. The answer should be displayed with only one decimal place.
//The formula to convert a Celsius temperature to Fahrenheit is:
//Degrees_F = (9(Degrees_C)/5) + 32)
//The formula to convert a Fahrenheit temperature to Celsius is:
//Degrees_C = 5(Degrees_F− 32)/9

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
		} 
		else {
			if(char1 == 'C'){ 
				num1 = (float) ((num1* (9.0/5.0)) + 32.0);
				System.out.println("The equivalent temperature in Fahrenheit is: " + num1);
			}
			else {
				System.out.println("ERROR: Please enter a 'C' or an 'F'");	
				System.exit(0);
			}
		}
		
		kbd.close();
	}

}
