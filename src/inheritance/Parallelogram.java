package inheritance;

public class Parallelogram extends Quadrilateral {
	
	private double height;
	
	public Parallelogram(){
		
		super();
		height = 10;
		
	}
	
	public Parallelogram(double length, double width, double xHeight){
		
		super(length, width, length, width);
		height = xHeight;
		
	}
	
	public double area(){
		
		return super.getSide1() * height;
		
	}
	
}