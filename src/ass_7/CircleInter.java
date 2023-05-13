package ass_7;

public class CircleInter implements ShapeInterface {
	double radius;

	public CircleInter(double radius) {
		this.radius =  radius;
	}

	@Override
	public double getArea() {
		double result = Math.PI * Math.pow(radius, 2);
		return result;
	}
}
