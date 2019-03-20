package interfaces;

import java.util.ArrayList;

public class TeacherStudentActivity {

	public static void main(String[] args) {
		
		Person teacher1 = new Teacher();
		Person teacher2 = new Teacher();
		Person teacher3 = new Teacher();
		Person teacher4 = new Teacher();

		Person student1 = new Student();
		Person student2 = new Student();
		Person student3 = new Student();
		Person student4 = new Student();
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(teacher1);
		persons.add(teacher2);
		persons.add(teacher3);
		persons.add(teacher4);
		
		persons.add(student1);
		persons.add(student2);
		persons.add(student3);
		persons.add(student4);

		System.out.println("Names of Everyone: ");
		
		for(Person temp: persons) {
			
			System.out.println(temp.getName());
			
		}


	}

}
