//Matt Raetano
//Program adds two whole numbers together
import java.util.*;

public class Tutorial1 {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		int n1, n2;

		System.out.println("Hello out there.");
		System.out.println("I will add two numbers for you.");
		System.out.println("Enter two whole numbers on a line:");

		n1 = kbd.nextInt();
		n2 = kbd.nextInt();

		System.out.println("The sum of those two numbers is");
		System.out.println( n1 + n2 );

		kbd.close();
	}

}
