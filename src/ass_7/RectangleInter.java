package ass_7;

public class RectangleInter implements ShapeInterface{
	double height;
	double width;
	
	public RectangleInter(double height,double width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		double result = height*width;
		return result;
	}
}
