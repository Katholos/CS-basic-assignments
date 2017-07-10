//Matt Raetano
//Program acts as a basic receipt for the amount of money you pay based on what you buy
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
