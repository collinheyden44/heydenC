package searching;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearchIntArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random generator = new Random();
		int min = 1;
		int max = 10000;
		
		boolean isPresent;
		
		int[] nums = new int[100];
		
		for(int i = 0; i < nums.length; i++) {
			
			nums[i] = generator.nextInt(max - min + 1) + min;
			
		}
		
		int choice = 0;
		
		do {
			
			isPresent = false;
			
			System.out.println("\n" + "Please type a number to check (Type -1 to quit)");
			
			int choiceNum = input.nextInt();
			
			if(choiceNum == -1) {
				
				System.out.println("\n" + "*  Program Ended  *");
				System.exit(0);
				
			}
			
			for(int j = 0; j < nums.length; j++) {
				
				if(nums[j] == choiceNum) {
					
					isPresent = true;
				
				}
				
			}
			
			System.out.println("The number that you picked is present in this Array: " + isPresent); 

			
		}
		while(choice != -1);

		input.close();

	}

}
