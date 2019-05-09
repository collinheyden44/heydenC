package inheritance;

public class Trapezoid extends Quadrilateral{
	
	private double height;
	
	public Trapezoid() {
		
		super();
		height = 4;
		
	}
	
	public Trapezoid(double top, double right, double bottom, double left, double ht) {
		
		super(top, right, bottom, left);
		
		height = ht;
		
	}
	
	public double getHeight() {
		
		return height;
		
	}
	
	public void setHeight(double ht) {
		
		height = ht;
		
	}
	
	public double area() {
		
		return (0.5 * (super.getSide1() + super.getSide3()) * height);
		
	}
	
}