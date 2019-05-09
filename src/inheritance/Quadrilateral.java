package inheritance;

public class Quadrilateral {
	
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	public Quadrilateral() {
		
		side1 = 10.0;
		side2 = 12.0;
		side3 = 8.0;
		side4 = 9.0;
		
	}
	
	public Quadrilateral(double newSide1, double newSide2, double newSide3, double newSide4) {
		
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
		side4 = newSide4;
		
	}
	
	public void setSide1(Double newSide1) {
		
		side1 = newSide1;
		
	}
	
	public void setSide2(Double newSide2) {
		
		side2 = newSide2;
		
	}
	
	public void setSide3(Double newSide3) {
		
		side3 = newSide3;
		
	}
	
	public void setSide4(Double newSide4) {
		
		side4 = newSide4;
		
	}
	
	public Double getSide1() {
		
		return side1;
		
	}
	
	public Double getSide2() {
		
		return side2;
		
	}
	
	public Double getSide3() {
		
		return side3;
		
	}
	
	public Double getSide4() {
		
		return side4;
		
	}
	
	
	public Double perimeter() {
		
		Double perim = side1 + side2 + side3 + side4;
		
		return perim;
		
	}

}
