package interfaces;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1 = new Teacher();
		
		System.out.println("Teacher's Info: ");
		System.out.println("Name: " + person1.getName());
		System.out.println("Age: " + person1.getAge());

		
		Person person2 = new Student();
		
		System.out.println("\n\n" + "Student's Info: ");
		System.out.println("Name: " + person2.getName());
		System.out.println("Age: " + person2.getAge());

	}

}
