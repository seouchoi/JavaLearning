package ass_7;

public class Circle extends Shape{
	double radius;
	
	public Circle(double radius) {
		this.radius =  radius;
	}
	@Override
	public double getArea() {
		double result = Math.PI*Math.pow(radius,2);
		return result;
	}
}
