
class MyMath {
	int add (int a, int b) {
		return a + b;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	double div(double a, double b) {
		return a / b;
	}
}


public class MethodEx {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		int addResult = mm.add(5, 3);
		int subResult = mm.sub(5, 3);
		int mulResult = mm.mul(5, 3);
		double divResult = mm.div(5, 3);
		
		System.out.println(addResult); // 8
		System.out.println(subResult); // 2
		System.out.println(mulResult); // 15
		System.out.println(divResult); // 1.6666666666666667
	}

}

