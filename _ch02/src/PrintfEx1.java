
public class PrintfEx1 {
	public static void main(String[] args) {
		System.out.printf("%d%n", 15); // 15
		System.out.printf("%o%n", 15); // 17
		System.out.printf("%x%n", 15); // f
	
		double number = 123.456789;
		System.out.printf("%f%n", number); // 123.456789
		System.out.printf("%e%n", number); // 1.234568e+02
		System.out.printf("%g%n", number); // 123.457
	}
}
