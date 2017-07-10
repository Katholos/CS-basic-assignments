//Matt Raetano
//This program will make use of loops to print out the alphabet without printing it out using strings
public class Alphabet {

	public static void main(String[] args) {
		
		char myVariable = 'A';
		
		//Loop created that if the int equivalent to char 'A' is less than 'Z' loop through it.
		while(myVariable < 91){
			System.out.print(myVariable + " ");
			myVariable++;
		}
	
	}
}
