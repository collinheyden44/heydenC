package searching;

import java.util.Random;
import java.util.Scanner;

public class MergeSortSalaries {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		Scanner input = new Scanner(System.in);
		
		JavaSorting bob = new JavaSorting();
		
		int max = 10000000;
		int min = 1;
		
		int[] salaries = new int[653];
		
		for(int i = 0; i < salaries.length; i++) {
			
			salaries[i] = (generator.nextInt((max - min) + 1) + min);
		
		}
		
		System.out.println("Type 1 for ascending or 2 for descending");
		int choice = input.nextInt();
		
		if(choice == 1) {
			
			 bob.mergesortAscending(salaries, 1, 10000000);
			
		} else if(choice == 2) {
			
			bob.mergesortDescending(salaries, 1, 10000000);
			
		} else {
			
			System.out.println("You typed an incorrect number!");
			
		}
		
		input.close();

	}

}




