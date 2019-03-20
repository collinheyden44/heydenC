package interfaces;

import java.util.ArrayList;

public class RectangleCircleActivity {

	public static void main(String[] args) {
		
		Shape rectangle1 = new Rectangle(12, 9);
		Shape rectangle2 = new Rectangle(10, 2);
		Shape rectangle3 = new Rectangle(8, 6);
		Shape rectangle4 = new Rectangle(6, 2);
		Shape rectangle5 = new Rectangle(22, 14);
		Shape rectangle6 = new Rectangle(12, 12);
		Shape rectangle7 = new Rectangle(3, 3);
		Shape rectangle8 = new Rectangle(14, 4);
		
		Shape circle1 = new Circle(6);
		Shape circle2 = new Circle(8);
		Shape circle3 = new Circle(10);
		Shape circle4 = new Circle(12);
		Shape circle5 = new Circle(22);
		Shape circle6 = new Circle(2);
		Shape circle7 = new Circle(18);
		Shape circle8 = new Circle(9);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(rectangle1);
		shapes.add(rectangle2);
		shapes.add(rectangle3);
		shapes.add(rectangle4);
		shapes.add(rectangle5);
		shapes.add(rectangle6);
		shapes.add(rectangle7);
		shapes.add(rectangle8);
		
		shapes.add(circle1);
		shapes.add(circle2);
		shapes.add(circle3);
		shapes.add(circle4);
		shapes.add(circle5);
		shapes.add(circle6);
		shapes.add(circle7);
		shapes.add(circle8);
		
		double sum = 0.0;
		
		for(Shape temp: shapes) {
			
			sum += temp.area();
			
		}
		
		double smallestPerimeter = 999999999999.9;
		
		for(Shape temp: shapes) {
			
			if(temp.perimeter() < smallestPerimeter) {
				
				smallestPerimeter = temp.perimeter();
				
			}
			
		}
		
		System.out.println("Sum of areas: " + sum);
		System.out.println("Smallest perimeter: " + smallestPerimeter);

	}

}
