package interfaces;

import java.util.ArrayList;

public class AnimalsTest {

	public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Cat("Johnny", 4, true));
		animals.add(new Cat("Freddy", 12, true));
		animals.add(new Cat("Snowball", 2, true));
		animals.add(new Cat("Snowflake", 9, true));
		animals.add(new Dog("Philip", 10, false));
		animals.add(new Dog("Oreo", 8, false));
		animals.add(new Dog("Buddy", 3, false));
		animals.add(new Dog("Jimmy", 1, false));
		
		for(Animal temp: animals) {
			
			temp.act();
			temp.toString();
			
		}




	}

}
