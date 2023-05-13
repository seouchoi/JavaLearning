package ass_7;

public class AreaTesterInter {
	public static void main(String[] args) {
		TriangleInter tri = new TriangleInter(10,5);
		RectangleInter rec = new RectangleInter(10,5);
		CircleInter clr = new CircleInter(10);
		
		System.out.println(tri.getArea());
		System.out.println(rec.getArea());
		System.out.println(clr.getArea());
	}

}
