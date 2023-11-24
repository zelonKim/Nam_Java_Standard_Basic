
class Point2D {
	int x;
	int y;
	String getLocation() {
		return "첫번째 위치는 "+ x + ", 두번째 위치는 " + y +"입니다";
	}
}

class Point3D extends Point2D {
	int z;
	String getLocation() {
		return "첫번째 위치는 "+ x + ", 두번째 위치는 " + y + ", 세번째 위치는 " + z + "입니다";
	}
}


public class OverRidingEx {
	public static void main(String[] args) {
		Point3D point3d = new Point3D();
		point3d.x = 3;
		point3d.y = 5;
		point3d.z = 7;
		System.out.println(point3d.getLocation());
	}
}
