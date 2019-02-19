package searching;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearchNamesArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean isPresent;
		
		String[] names = new String[10];
		
		names[0] = "Collin";
		names[1] = "Carly";
		names[2] = "James";
		names[3] = "April";
		names[4] = "Caleb";
		names[5] = "Chloe";
		names[6] = "Snowball";
		names[7] = "Snowflake";
		names[8] = "Phil";
		names[9] = "Ray";
		
		int choice = 0;
		
		do {
			
			isPresent = false;
			
			System.out.println("\n" + "Please type a name to check (Type Quit to end the program)");
			
			String choiceNum = input.nextLine();
			
			if(choiceNum.equals("Quit")) {
				
				System.out.println("\n" + "*  Program Ended  *");
				System.exit(0);
				
			}
			
			for(int j = 0; j < names.length; j++) {
				
				if(names[j].equals(choiceNum)) {
					
					isPresent = true;
				
				}
				
			}
			
			System.out.println("The name that you picked is present in this Array: " + isPresent); 

			
		}
		while(choice != -1);

		input.close();

	}

}
