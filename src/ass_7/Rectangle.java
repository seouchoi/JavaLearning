package ass_7;

public class Rectangle extends Shape {
	double height;
	double width;
	
	public Rectangle(double height,double width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		double result = height*width;
		return result;
	}
}
