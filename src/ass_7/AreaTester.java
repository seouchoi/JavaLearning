package ass_7;

public class AreaTester {

	public static void main(String[] args) {
		Triangle tri = new Triangle(4,5);
		Rectangle rec = new Rectangle(4,5);
		Circle clr = new Circle(5);
		
		System.out.println(tri.getArea());
		System.out.println(rec.getArea());
		System.out.println(clr.getArea());
	}

}
