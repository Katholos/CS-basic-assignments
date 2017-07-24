//Matt Raetano
//Write a Java application program that will add up the cost of three items, then print the final total with sales tax.
//You should begin by prompting the user to enter three separate prices for three items that are being purchased. For each item you should ask for (in this order) the quantity of the product and the price of the product.
//The program should compute, and print to the screen:
//the subtotal (the total amount due before tax)
//sales tax (the amount of sales tax that will be added, assume 7% tax rate)
//total due (subtotal + sales tax)

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		double n1, n2, n3, p1, p2, p3, tax, subtotal, total;
		
		System.out.print("Enter the quantity of the first product: ");
		n1 = kbd.nextDouble();
		System.out.print("Enter the price of the first product: $");
		p1 = kbd.nextDouble();
		System.out.print("Enter the quantity of the second product: ");
		n2 = kbd.nextDouble();
		System.out.print("Enter the price of the second product: $");
		p2 = kbd.nextDouble();
		System.out.print("Enter the quantity of the third product: ");
		n3 = kbd.nextDouble();
		System.out.print("Enter the price of the third product: $");
		p3 = kbd.nextDouble();
	
		subtotal = (n1 * p1) + (n2 * p2) + (n3 * p3);
		
		tax = subtotal * .07;
		tax = (int) (tax * 100) + .5;
		tax = (double) tax/100;
		
		total = subtotal + tax;
		
		System.out.printf("Subtotal: $%.2f \n", subtotal);
		System.out.printf("Sales Tax: $%.2f \n", tax);
		System.out.printf("Total Due: $%.2f \n", total);
	
		kbd.close();
	}

}
