package interfaces;

public class Cat implements Animal {
	
	private String name;
	private int age;
	private boolean isFriendly;
	
	public Cat() {
		
		name = "Snowball";
		age = 1;
		isFriendly = true;
		
	}
	
	public Cat(String newName, int newAge, boolean newIsFriendly) {
		
		name = newName;
		age = newAge;
		isFriendly = newIsFriendly;
		
	}
	
	public void act() {
		
		age += 9;
		
		if(isFriendly == false) {
			
			isFriendly = true;
			
		}
		else if(isFriendly == true) {
			
			isFriendly = false;
			
		}
		
	}
	
	public String toString() {
		
		return "Cat Object: \n  Name: " + name + "  Age: " + age + " Friendly?: " + isFriendly;
		
	}

	public String isFriendly() {
		
		return "Your dog is friendly: " + isFriendly;
	
	}

}
