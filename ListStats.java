//Matt Raetano
//Write a program that will read in a list of positive integers (including zero) and display some statistics regarding the integers.
//The user is assumed to enter the list in sorted order, starting with the smallest number and ending with the largest number.
//Your program must store the all of the integers in an array. The maximum number of integers that you can expect is 100, however there may not necessarily be that many. Your program should allow the user to continue entering numbers until they enter a negative number or until the array is filled - whichever occurs first. If the user enters 100 numbers, you should output an message stating that the maximum size for the list has been reached, then proceed with the calculations.
//After you have placed all of the integers into an array, your program should perform the following tasks, in this order:
//Display the count of how many numbers were read
//Display the smallest number in the array
//Display the largest number in the array
//Display the median (the median is the integer that is stored in the middle position of the array)
//Display the average of all the numbers
//Allow the user to search the array for a specified value.
//First, ask the user to enter an integer to search for.
//Next, search the array to determine if the given integer is in the array.
//If the integer is not found, display a message stating that the integer is not in the list.
//If the integer is found, then display the position number of where you found the integer. If the integer happens to be in the array more than once, then you only need to tell the first position number where you found it.
//After performing the search, ask the user if he/she wants to search for more integers. Continue searching for numbers until the user answers "N".

import java.util.*;

public class ListStats {
	
	public static final int MAXSIZE = 100;

	public static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// declaring variables
		double median = 0, average = 0;
		int size = 0, key = 0, pos;
		boolean found;
		String answer;

		System.out.println("This program will take a list of numbers and will not calculate the excess if you input too many numbers, input a negative to end");
		System.out.println();
		System.out.println("Please enter a list of arrays: ");
		
		// creating our array to hold the inputed data
		int [] array = new int[MAXSIZE];

		// calling the methods into the main
		size = getNumbers(array, size);
		median = Median(median, size, array);
		average = Average(average, size, array);
		
		// prints for the displayed data
		System.out.println("The smallest number in the array is: " + array[0]);
		System.out.println("The largest number is: " + array[size-1]);
		System.out.println("The array is " + size + " number(s) long");
		System.out.println("The median of the array is: " + median);
		System.out.println("The average of the array is: " + average);
		System.out.println();
		System.out.println("Would you like to find a certain number in the array? (yes/no)");
		
		answer = kbd.next();
		
		// to see if the user even wants to find a number in the array
		if (answer.equalsIgnoreCase("yes")){
			System.out.println("What number would you like to search for?");
			
			key = kbd.nextInt();
			
			pos = Search(array, key, size);
			found = Search1(array, key, size);
			
			if ( !found ){
				System.out.print("Not Found");
			}
			else { 
				System.out.println("Found at position " + pos + " in the array.");
			}
		}
		else if (answer.equalsIgnoreCase("no")){
			System.out.println("Thank you for your time");
		}
	}
	
	 /**
	  * method gets ints from kbd to store in array
	  * @param array calling from a created array in main
	  * @param size the partially filled array's size
	  * @return returns the size of the array, being partially filled
	  */
	public static int getNumbers(int[] array, int size){
		 size = 0; 
	     int temp; 
	 
	     // loop to get values from kbd & store in array 
	     temp = kbd.nextInt(); 
	 
	     while (temp >= 0  &&  size < MAXSIZE) { 
	    	 array[size] = temp; 
	    	 size++; 
	    	 if ( size < MAXSIZE ) {
	    		 temp = kbd.nextInt(); 
	    	 } 
	     }	 
	 
	return size; 
	 
	}
		
	/**
	 * method finds the median of the array
	 * @param median the middle number of the array
	 * @param size the length of the partial filled array
	 * @param array the one created in main
	 * @return the median as a double
	 */
	public static double Median(double median, int size, int[] array){
		
		// calculatiosn for the median
		median = array[size / 2];
		if (size % 2 == 0){
			median = median - .5;
		}
		
		return median;
	}
	
	/**
	 * gets the average of the array by adding and diving all ints
	 * @param average the sum total / size
	 * @param size the length of the partially filled array
	 * @param array the one created in main
	 * @returns the average
	 */
	public static double Average(double average, int size, int[] array){
		double sum = 0;
		average = 0;

		// to loop through the array to create the sum and average
		for(int i = 0; i < size; i++){
			sum = array[i] + sum;
			average = sum / size;
		}
		return average;
	}
	/**
	 * method searches the array for a int
	 * @param array created in main
	 * @param key the int searched for
	 * @param size the amount of ints in the array
	 * @return the place of the int if it is found
	 */
	public static int Search(int[] array, int key, int size){
		int place = 0;
		
		// looping through to find the pos
		for(int pos = 0; pos < size; pos++){
			if ( key == array[pos]){
				return pos;
			}
		}
		return -1;	
	}
	/**
	 * method searches the array for a int
	 * @param array created in main
	 * @param key the int searched for
	 * @param size the amount of ints in the array
	 * @return the boolean if it is found or not
	 */
	public static boolean Search1(int[] array, int key, int size){
		boolean found = false;
		
		// looping through to see if the number is there
		for(int pos = 0; pos < size; pos++){
			if ( key == array[pos]){
				found = true;
			}
		}
		return found;
	}
}
