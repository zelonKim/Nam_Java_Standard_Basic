
class Point2D {
	int x;
	int y;
	String getLocation() {
		return "ù��° ��ġ�� "+ x + ", �ι�° ��ġ�� " + y +"�Դϴ�";
	}
}

class Point3D extends Point2D {
	int z;
	String getLocation() {
		return "ù��° ��ġ�� "+ x + ", �ι�° ��ġ�� " + y + ", ����° ��ġ�� " + z + "�Դϴ�";
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
