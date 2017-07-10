//Matt Raetano
//Program finds the sum, difference, and product of two inputted integers
import java.util.*;

public class SimpleMath {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		float n1, n2, sum, diff, prod;
		
		System.out.println("Please enter two numbers:");
		n1 = kbd.nextFloat();
		n2 = kbd.nextFloat();
	
		sum = n1 + n2;
		diff = n1 - n2;
		prod = n1 * n2;
	
		System.out.println("The sum of your numbers is " + sum );
		System.out.println("The difference of your numbers is " + diff );
		System.out.println("The product of your numbers is " + prod );

		kbd.close();
	
	}

}
