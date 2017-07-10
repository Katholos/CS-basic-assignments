//Matt Raetano
//This program will act as a basic ATM, providing a menu and allowing the withdrawal and deposit in accounts

import java.util.*;

public class ATM {

	public static Scanner kbd;

	public static void main(String[] args) {

		kbd = new Scanner(System.in);

		// declared and initialized variables
		int attempts = 0;
		double depositAmt = 0, withdrawAmt = 0;

				
		// while loop to protect the password if guessed more than 3
		while (attempts <= 3) {

			System.out.println("Please enter your account number: ");
			String acctNum = kbd.nextLine();
			// if statement to lock the user out if they guess incorrectly too many times
			if(attempts >= 3) { 
				System.out.println("Too many guesses, password locked.");
				System.exit(0);
			}
			
			System.out.println("Please enter your password: ");
			String pwd = kbd.nextLine();
			
			String result = checkID(acctNum, pwd);
			if (result.equals("error")){
				attempts++;
			} 
			else {
				double balance = Double.parseDouble(result);
				int choice;
				do {
					choice = menu();
					switch (choice) {
					case 1:
						//show account balance
						displayBalance(balance);
						break;
					case 2:
						//Ask the depositAmount then deposit(balance, depositAmount)
						System.out.println("\nEnter amount you would like to deposit: $ ");
						depositAmt = kbd.nextDouble();
						balance = deposit(depositAmt, balance);
						break;
					case 3:
						//you should ask the user for a withdrawalAmount then balance = withdraw(balance) 
						System.out.println("Please enter and amount you would like to withdrawl: $ ");
						withdrawAmt = kbd.nextDouble();
						while(withdrawAmt > balance) {
							System.out.println("Error; insufficient funds!" + " Please enter a different amount: $");
							withdrawAmt = kbd.nextDouble();
						}
						balance = withdraw(balance, withdrawAmt);	
						break;
					case 4:
						System.out.println("\nThank you for using my ATM, please have a good day.");
						System.exit(0);
						break;
					}	
				} while (choice != 4);
			}
		} 
		kbd.close();
	}
	
	/**
	 * Determines if acctNum is a valid account number and pwd is the
	 * correct password for the account.
	 * @param acctNum The account number to be tested
	 * @param pwd The possible password for the account
	 * @return If the account information is valid, returns the account balance
	 * as a string. If the account information is invalid, returns the string "error".
	 */
	public static String checkID(String acctNum, String pwd){
		String result = "error";
		
		// Strings a, b, and c contain the valid account numbers and passwords.
		// For each string, the account number is listed first, followed by
		// a space, followed by the password for the account, followed by a space,
		// followed by the current balance.
		String a = "44567-5 mypassword 520.36";
		String b = "1234567-6 anotherpassword 48.20";
		String c = "4321-0 betterpassword 96.74";
		
		if (acctNum.equals(a.substring(0, a.indexOf(" "))) && pwd.equals(a.substring(a.indexOf(" ") + 1, a.lastIndexOf(" ")))){ 
			return a.substring(a.lastIndexOf(" ") + 1);
		}
		else if (acctNum.equals(b.substring(0, b.indexOf(" "))) && pwd.equals(b.substring(b.indexOf(" ") + 1, b.lastIndexOf(" ")))){
			return b.substring(b.lastIndexOf(" ") + 1);
		}
		else if (acctNum.equals(c.substring(0, c.indexOf(" "))) && pwd.equals(c.substring(c.indexOf(" ") + 1, c.lastIndexOf(" ")))){
			return c.substring(c.lastIndexOf(" ") + 1);
		}
		return result;
	}
	/**
	 * method to display a menu every time that a choice is require
	 * @return returns the choice of what option they would like to use in the menu
	 */
	public static int menu(){
		int choice = 0;
		do {
			System.out.println("1. Display Balance \n2. Deposit \n3. Withdraw \n4. Log Out"); 
			//Ask the choice
			choice = kbd.nextInt();
			//IF the choice is invalid, display an error message
		} while (choice < 1 || choice > 4);

		return choice;
	}
	/**
	 * method is the first to be called in the switch statement, it displays the balance of the user
	 * @param bal is a double that stores the amount of money the user has
	 */
	public static void displayBalance(double bal){
		System.out.printf("Your balance is $%.2f", bal); 
		System.out.println();
	}
	/**
	 * this is the 2nd method called in the switch statement, used so the user can deposit and change the balance
	 * @param bal is the users amount they have
	 * @param deposit is how much the user wants to put into the balance
	 * @return
	 */
	public static double deposit(double bal, double deposit){
		double depositAmt = bal, currentBal = deposit;
		double newBalance = depositAmt + currentBal;

		System.out.printf("Your new balance is $%.2f\n", newBalance);

		return newBalance;
	}
	/**
	 * the 3rd method called, withdraws a user inputed amount of money from the balance
	 * @param bal users current amount of money
	 * @param withd amount they want subtracted
	 * @return
	 */
	public static double withdraw(double bal, double withd){		
		//if enough return balance - withdraw
		double withdrawAmt = bal, balance = withd, newBalance;
		
		newBalance = withdrawAmt - balance;
		System.out.printf("Your new balance is %.2f\n", newBalance); 

		return newBalance;
	}

}