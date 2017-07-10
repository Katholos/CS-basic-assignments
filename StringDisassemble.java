//Matt Raetano

import java.util.*; 

public class StringDisassemble { 

    public static void main(String[] args) { 
    	int posOfSpace;
    	
        Scanner kbd = new Scanner(System.in);
        String firstName, lastName, fullName;

        System.out.println("Enter your first and last name:");
        fullName = kbd.nextLine();

        System.out.println();
        System.out.println("Your full name is: " + fullName);
        
        posOfSpace = fullName.indexOf(" ");
        firstName = fullName.substring(0, posOfSpace);
        lastName = fullName.substring(posOfSpace + 1);
        
        System.out.println("Your first name is: " + firstName);
        System.out.println("Your last name is: " + lastName);
        
        kbd.close(); 
    } 
}