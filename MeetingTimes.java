//Matt Raetano
//This program asks for the what meeting times people want and picks the most picked.
import java.util.*;

public class MeetingTimes {

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);
		int count1 = 0, count2 = 0, count3 = 0;
		
		System.out.println("Meeting Times:");
		System.out.println("1) 8:00-12:00 2) 12:00-18:00 3) 18:00-23:00");
		System.out.println("\nChoose option 1, 2, or 3.");
		
		//Created 4 times for the amount of people that will input a number
		//Each if statement is used as a counter 
		System.out.print("Enter the best time for person 1: ");
		int time1 = kbd.nextInt();
		if(time1 > 3){
			System.out.println("ERROR: Please enter a number between 1-3");
			System.exit(0);
		}
		else if(time1 == 1){
			count1 = count1 + 1;
			if(time1 == 2)
				count2 = count2 + 1;
			if(time1 == 3)
				count3 = count3 + 1;
		}
		System.out.print("Enter the best time for person 2: ");
		int time2 = kbd.nextInt();
		if(time2 > 3){
			System.out.println("ERROR: Please enter a number between 1-3");
			System.exit(0);
		}
		else if(time2 == 1){
			count1 = count1 + 1;
			if(time2 == 2)
				count2 = count2 + 1;
			if(time2 == 3)
				count3 = count3 + 1;
		}
		System.out.print("Enter the best time for person 3: ");
		int time3 = kbd.nextInt();
		if(time3 > 3){
			System.out.println("ERROR: Please enter a number between 1-3");
			System.exit(0);
		}
		else if(time3 == 1){
			count1 = count1 + 1;
			if(time3 == 2)
				count2 = count2 + 1;
			if(time3 == 3)
				count3 = count3 + 1;
		}
		System.out.print("Enter the best time for person 4: ");
		int time4 = kbd.nextInt();
		if(time4 > 3){
			System.out.println("ERROR: Please enter a number between 1-3");
			System.exit(0);
		}
		else if(time4 == 1){
			count1 = count1 + 1;
			if(time4 == 2)
				count2 = count2 + 1;
			if(time4 == 3)
				count3 = count3 + 1;
		}
		System.out.println("\nThe best meeting time available is: ");
		
		//Now the counters are compared against each other
		if((count1 > count2) && (count1 > count3))
			System.out.println("8:00-12:00");
		if((count2 > count1) && (count2 > count3))
			System.out.println("12:00-18:00");
		if((count3 > count1) && (count3 > count2))
			System.out.println("18:00-23:00");
	
		kbd.close();
	}

}
