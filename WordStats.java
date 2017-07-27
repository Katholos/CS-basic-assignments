//Matt Raetano
//Write a program that will:
//ask the user to enter the name of an input data file
//read the contents of the file and display some statistics about the information found in the file
//create an output file which has the same name as the input file, except that the word "copy" will be attached to the end of the filename
//in the output file, create a copy of the input file except that it should be double-spaced
//if either the input or the output files cannot be opened, display an error message stating that the file cannot be opened, and then stop the program - you do not need to specify which one could not be opened
//Statistics
//Your program must read the contents of the input file and print the following statistics to the screen:
//The number of characters in the file.
//The number of words in the file.
//The number of lines in the file.
//The number of paragraphs in the file.
//File Copy

import java.util.*;
import java.io.*;

public class WordStats {

	public static void main(String[] args) {
		
		// intializing variables
		String textfile, line;
		int words = 0, datalines = 0, chars = 0, paragraphs = 0;
		boolean lastWasText = false, thisIsText;
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Name of data file you would like to open: ");
		textfile = kbd.nextLine();
		
		try{
			
			// Set up connection to the input file
			Scanner input = new Scanner(new FileReader(textfile));

			// Set up connection to an output file
			// Name of the file was "datacopy.txt" but can be changed to be anything 
			PrintWriter output = new PrintWriter(new FileOutputStream("datacopy.txt"));
		    
			// as long as there are more lines left in the input file
			// read from the input file, and copy to the output file
			while (input.hasNextLine()){
				
				// reads the lines and chars and words using a tokenizer
		       		datalines++;
		        	line = input.nextLine();
		        	chars += line.length();
		        	words += new StringTokenizer(line, " ,").countTokens();
		        	thisIsText = line.length() > 0;
		        
		        	// booleans to discount multiple spaces
		        	if (!lastWasText && thisIsText) {
		        		paragraphs++;
		        	}
		        
		        	lastWasText = thisIsText;
		        
		        	// makes the new file double spaced
				output.println(line + "\n");
			}

			// close the files
			input.close();
			output.close();	
			print(words, datalines, chars, paragraphs);
		}
		catch(FileNotFoundException e){
			System.out.println("There was an error opening one of the files.");
		}
		kbd.close();
	}
	
	/**
	 * method takes the data from the user and prints the stats of the data txt
	 * @param words the words in the sentence
	 * @param datalines the amount of lines
	 * @param chars how long each line is
	 * @param paragraphs how many paragraphs are in the file
	 */
	public static void print(int words, int datalines, int chars, int paragraphs){
		
		System.out.println("\n" + "Characters: " + chars);
		System.out.println("Words: " + words);
		System.out.println("Lines: " + datalines);
		System.out.println("Paragraphs: " + paragraphs);
		System.out.println("\n" + "New file created");
	}

}
