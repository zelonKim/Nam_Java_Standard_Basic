package exception1;
/*
public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(0/0);
			System.out.println(3);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("AE 惯积");
				System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOOBE 惯积");
			System.out.println(5);
		}
		System.out.println(6);
	}
}
*/

///////////////////////

/*
public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(args[0]);
			System.out.println(3);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("AE 惯积");
				System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("AIOOBE 惯积");
			System.out.println(5);
		}
		System.out.println(6);
	}
}
*/


///////////////////////////////

/*
public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(args[0]);
			System.out.println(3);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("AE 惯积");
				System.out.println(4);
		} catch (Exception e) {
			System.out.println("E 惯积");
			System.out.println(5);
		}
		System.out.println(6);
	}
}

*/

/////////////////////////////


public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(args[0]);
			System.out.println(3);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} 
		System.out.println(6);
	}
}