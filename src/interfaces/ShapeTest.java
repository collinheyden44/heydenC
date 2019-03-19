package interfaces;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input rectangle length");
		int num1 = input.nextInt();
		System.out.println("Please input rectangle width");
		int num2 = input.nextInt();
		
		Shape shape1 = new Rectangle(num1, num2);
		
		System.out.println("\n" + "Recatngle Area: " + shape1.area());
		System.out.println("Rectangle Perimeter: " + shape1.perimeter());
		
		
		
		System.out.println("\n\n" + "Please input cirle radius");
		int num3 = input.nextInt();
		
		Shape shape2 = new Circle(num3);

		System.out.println("Circle Area: " + shape2.area());
		System.out.println("Circle Perimeter: " + shape2.perimeter());
		
		
		input.close();
	
	}

}
