package interfaces;

import java.util.Random;

public class Dog implements Animal {
	
	private String name;
	private int age;
	private boolean injured;
	
	public Dog() {
		
		name = "Buddy";
		age = 1;
		injured = false;
		
	}
	
	public Dog(String newName, int newAge, boolean newInjured) {
		
		name = newName;
		age = newAge;
		injured = newInjured;
		
	}
	
	public void act() {
		
		injured = false;
		age += 7;
		
		Random generator = new Random();
		int max = 50;
		int min = 1;
		int injuredChance = (generator.nextInt(max - min + 1) - min);
		
		if(injuredChance == 1) {
			
			injured = true;
			System.out.println("Your dog has been injured!");

		}

	}
	
	public String toString() {
		
		return "Dog Object: \n  Name: " + name + "  Age: " + age + " Injured?: " + injured;
		
	}

	public void vet() {
		
		if(injured == true) {
			
			injured = false;
			System.out.println("Your dog is now healthy! (Not Injured)");
			
		}
		else if(injured == false) {
			
			System.out.println("Your dog was already not injured and very healthy!");
			
		}
		
	
	}
	

}
