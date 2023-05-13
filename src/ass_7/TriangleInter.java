package ass_7;

public class TriangleInter implements ShapeInterface {
	double height;
	double width;
	
	public TriangleInter(double height,double width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		double result = (height*width)/2;
		return result;
	}

}
