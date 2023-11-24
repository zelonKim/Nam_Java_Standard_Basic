class Point2 {
	int x, y;
	
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


class Point3 extends Point2 {
	int z;
	
	Point3(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}


public class superEx2 {
	public static void main(String[] args) {
		Point3 point3 = new Point3(3, 5, 7);
		System.out.println(point3.x); // 3
		System.out.println(point3.y); // 5
		System.out.println(point3.z); // 7
	}
}
