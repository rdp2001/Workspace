
public class Circle {

	private double radius;
	
	public Circle(double r) { //constructor
		radius = r;
	}
	
	public double area() { //calculate area and return area of circle
		double a = Math.PI*radius*radius;
		return a;
	}//end of area method
	
	
	
	public double diameter() {
		Circle cir = new Circle(radius);
		double s = cir.circumference();
		return 2*radius;
	}//end of circumference
	public double circumference() {
		return 2*Math.PI*radius;
	}//end of circumference
}//end of circle class

