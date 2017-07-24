//Matt Raetano
//Write a java application program that simulates a simple slot machine in which three numbers between 0 and 9 are randomly selected and printed side by side. The program will allow the user to place a bet, and then make a payout if any two of the numbers are the same, or if all three numbers are the sam
//The following is a synopsis of how the program should operate:
//The game starts with the user having a balance of $10.00.
//The program asks the user how much he/she wishes to bet.
//If the user enters a number less than zero, or greater than the amount of money in the user's balance, you should repeat step 2.
//If the user entered a bet of zero, go to step 9 below.
//After a valid bet has been entered, the program should randomly select three numbers from 0-9 and display them on the screen (with some space between for neatness).
//If a winning combination is produced, the program should calculate and display the amount of money the user has won. (If there is no win, then do not display anything)
//Display the remaining balance. The balance at this point will be the original balance, minus the amount of the bet, plus any winnings.
//If the user still has money remaining, the program should ask the user how much he/she wishes to bet.
//If the user enters a number less than zero, or greater than the amount of money in the user's balance, you should repeat step 7.
//If the user does not have money remaining, you should display a message stating that     the user has run out of money, and then go to step 9 below.
//Repeat steps 3-8.
//At the conclusion of the program, you should display:
//The amount of money the user has won or lost.
//The final balance that the user will be cashing out.

import java.util.*;

public class SlotMachine{

	public static final int STARTMONEY = 10;
	
    public static void main(String[] args){

        Scanner kbd = new Scanner(System.in);
        Random generator = new Random();
        
        int moneywon = 0, moneybet = 0, totalBet = 0, totalWon = 0, balance = STARTMONEY;
        int slot1, slot2, slot3;
         
        // Ask user how much they'd like to bet
        System.out.print("How much would you like to bet: $");
        moneybet = (int) (kbd.nextDouble() * 100);
        //System.out.println(moneybet);
        
        if(moneybet > (balance*100)){
        	System.out.println("Insufficient funds.");
        	System.exit(0);
        }
        
        //while loop for the whole bet system to repeat
        while ((moneybet != 0) && (balance > 0)){
            totalBet += moneybet;

            slot1 = generator.nextInt(10);
            slot2 = generator.nextInt(10);
            slot3 = generator.nextInt(10);

            // Show the numbers
            System.out.println("Your three numbers are " + slot1 + " " + slot2 + " " + slot3 + " " );

            // If statement to decide if they win
            if (slot1 != slot2 && slot1 != slot3){
            	System.out.println("Sorry you didn't win.");
            }  
            else if (slot1 == slot2 && slot1 == slot3){
            	System.out.printf("You won $%.2f" , (((float)moneybet * (slot1 + 1))/100));
            	System.out.println();
            	moneywon = (moneybet * (slot1+1));
            }
            else{
            	System.out.printf("You won $%.2f" , ((((float)moneybet * (slot1)/100)))/2);
            	System.out.println();
            	moneywon = ((moneybet * slot1)/2);
            }      
            
            //Ask user how much they'd like to bet.
            System.out.println();
            System.out.print("How much money would you like to bet? Enter 0 if you are finished: $");
            moneybet = (int) (kbd.nextDouble() * 100);

            if(moneybet > (balance*100)){
            	System.out.println("Insufficient funds.");
            	break;
            }
            
            totalWon += moneywon;
            //Balance and if statement to control and print out the correct number at the end
            balance = ((STARTMONEY*100) - (totalBet) + (totalWon));
            if(balance <= 0){
            	System.out.println("You have run out of funds!");
            	break;
            }
        }
        
        //Displaying the total amount you win and the amount that you bet
        System.out.printf("Your total winnings are: $%.2f" , (float)totalWon/100);
        System.out.printf(" and your total bets were: $%.2f" , ((float)totalBet)/100);
        System.out.println();
        System.out.printf("Your total balance is: $%.2f", (float)balance/100);

        kbd.close();
    }

}
