package interfaces;

public class PersonTest2 {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher();
		Student student1 = new Student();
		
		teacher1.setName("Bob Fry");
		teacher1.payMe();
		
		student1.setName("Philip Johnson");;
		student1.outSick();
		student1.outSick();
		student1.outSick();
		
		System.out.println("Teacher's Info: ");
		System.out.println("Name: " + teacher1.getName());
		System.out.println("Age: " + teacher1.getAge());
		
		System.out.println("\n\n" + "Student's Info: ");
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());


	}

}
