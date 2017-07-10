//Matt Raetano
//program takes three whole numbers from the user and returns the product of them
import java.util.*;

public class MulThree {

	public static void main(String[] args) {

	Scanner kbd = new Scanner(System.in);
	//three ints for input, and one for the product so it can be printed on a single line
	int n1, n2, n3, ansr;

	System.out.println("Hello out there.");
	System.out.println("I will multiple three numbers for you.");
	System.out.println("Enter three whole numbers on a line:");

	n1 = kbd.nextInt();
	n2 = kbd.nextInt();
	n3 = kbd.nextInt();
	ansr = (n1 * n2 * n3);

	System.out.println("The product of those three numbers = " + ansr);
	
	kbd.close();

	}
}
