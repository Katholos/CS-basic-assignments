//Matt Raetano

import java.util.*;

public class StringAssemble {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        String firstName, lastName;
        String fullName;

        System.out.println("Enter your first and last name:");
        firstName = kbd.next();
        lastName = kbd.next();
        
        System.out.println();
        System.out.println("Your first name is: " + firstName);
        System.out.println("Your last name is: " + lastName);
        
        fullName = firstName + " " + lastName;
        System.out.println("Your full name is: " + fullName);
        
        kbd.close();
    }
}