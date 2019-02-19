package searching;

import java.util.Random;
import java.util.Scanner;

public class HighOrLow {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int max = 100;
		int min = 1;
		
		int num = generator.nextInt(max - min) + min;
		
		int guess = 0;
		
		int count = 0;
		
		System.out.println("Pick a number 1 - 100 and try to guess my number!");
		
		while (guess != num) {
			
			guess = input.nextInt();
			count++;
			
			if (guess > num) {
				
				System.out.println("Lower!");
				
			}
			
			else if (guess < num) {
				
				System.out.println("Higher!");
				
			}
			
		}
		
		System.out.println("Congratulations. You guessed my number with " + count + " tries!");
		
		input.close();
		
	}

}
