package ass_7;

public class Triangle extends Shape{
	double height;
	double width;
	
	public Triangle(double height,double width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		double result = (height*width)/2;
		return result;
	}
}
