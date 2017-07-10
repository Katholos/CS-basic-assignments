//Matt Raetano
//Program multiplies an inputed egg variable by the number of baskets

import java.util.*;

public class EggsInABasket {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
        int eggsPerBasket, numOfBaskets, totalEggs;

        System.out.println("Enter number of eggs: ");
        eggsPerBasket = kbd.nextInt();
        System.out.println("Enter number of baskets: ");
        numOfBaskets = kbd.nextInt();

        totalEggs = eggsPerBasket * numOfBaskets;
        System.out.println("You have " + totalEggs + " eggs.");

        kbd.close();
   }
}

