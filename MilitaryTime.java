//Matt Raetano
//This program will find the difference of hours and minutes between two military times
import java.util.*;

public class MilitaryTime {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		int n1, n2, quotient, remainder;
		
		System.out.println("Please enter the first time: ");
		n1 = kbd.nextInt();
		System.out.println("Please enter the second time: ");
		n2 = kbd.nextInt();
		
		quotient = (n2-n1)/100;
		remainder = (n2-n1)%100;
		//created an if statement in-case minutes are invalid
		if(remainder > 60){
			remainder = remainder-40;
		}
		
		System.out.println("The difference in the two times is " + quotient + " hours(s) and " + (remainder) + " minute(s)");
	
		kbd.close();
	}

}
