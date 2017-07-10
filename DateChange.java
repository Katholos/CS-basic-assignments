//Matt Raetano
//This program will receive an inputed date and then converts it into European style
import java.util.*;

public class DateChange {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter a date in the form mon/day/year: ");
		
		String reg_date = kbd.nextLine();
		
		int length = reg_date.length();
		int slash1 = reg_date.indexOf('/');
		int slash2 = reg_date.lastIndexOf('/');
		
		String month = reg_date.substring(0, slash1);
		String day = reg_date.substring(slash1+1, slash2);
		String year = reg_date.substring(slash2+1, length);
		
		//Was thinking of going the logical route of swapping the Strings day & month, but that would require many more lines of code
		//reg_date = reg_date.replace('/', '.');
		//reg_date = reg_date.replaceAll(month, day);
		
		System.out.println("Your date in European form is: ");
		System.out.println(day + "." + month + "." + year);
		
		kbd.close();
	}

}
