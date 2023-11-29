package exception1;

import java.io.IOException;

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
				System.out.println("AE 발생");
				System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOOBE 발생");
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
				System.out.println("AE 발생");
				System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("AIOOBE 발생");
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
				System.out.println("AE 발생");
				System.out.println(4);
		} catch (Exception e) {
			System.out.println("E 발생");
			System.out.println(5);
		}
		System.out.println(6);
	}
}

*/

/////////////////////////////

/*
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
*/



//////////////////////////////



 /*
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("발생된 예외가 있습니다."); // 예외 클래스명  예외 객체명 = new 예외 클래스명("예외 메시지");
			throw e;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램이 정상 종료되었습니다.");
	}
}
// 발생된 예외가 있습니다.
// 프로그램이 정상 종료되었습니다.
*/


/////////////////////////////



/*

// 예외를 떠넘기지 않을 경우
public class ExceptionEx1 {
	public static void main(String[] args) {
			File f = createFile("");
				if(f != null) {
				System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
			}
		}

	
	static File createFile(String fileName)  {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("파일명이 유효하지 않아서"); // 1. 파일명이 잘못되어, 예외를 발생시킴.
			File f = new File(fileName);
			f.createNewFile();
			return f;
		} catch(Exception e) { // 2. 발생된 예외를 처리함.
			System.out.println(e.getMessage()+" 파일 생성이 불가합니다."); 
			return null;
		}
		
	}
}
// 파일명이 유효하지 않아서 파일 생성이 불가합니다.
*/

//////////////////////////////////

/*
// 예외를 떠넘길 경우
public class ExceptionEx1 {
	public static void main(String[] args) {
		try { // 3. 떠넘겨 받은 예외를 처리함.
			File f = createFile(""); 
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage()+" 파일 생성이 불가합니다.");
		}
	}

	static File createFile(String fileName) throws Exception { // 2. 발생된 예외를 메서드를 호출했던 곳으로 떠넘김
		if (fileName==null || fileName.equals(""))
			throw new Exception("파일명이 유효하지 않아서"); // 1. 파일명이 잘못되어, 예외를 발생시킴.
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}
// 파일명이 유효하지 않아서 파일 생성이 불가합니다.
*/


/////////////////////////////////////


/*
 
// 다중 예외 처리하기
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) { //5. 떠넘겨 받은 두번째 예외를 처리함.
			System.out.println(" 파일 생성이 불가합니다.");
		}
	}

	
	static File createFile(String fileName) throws Exception { // 4. 메서드를 호출한 곳으로 두번째 예외를 떠넘김.
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("파일명이 유효하지 않아서"); // 1. 파일명이 잘못되어, 첫번째 예외를 발생시킴.
			File f = new File(fileName);
			f.createNewFile();
			return f;
		} catch(Exception e) { // 2. 발생된 첫번쨰 예외를 처리함.
			System.out.print(e.getMessage());
			throw e; // 3. 두번째 예외를 발생시킴.
		}
	}
}
*/


/////////////////////////////


public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			secret();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
			System.out.println("원인:" + ioe.getCause());
		}
	}
	
	static void secret() throws IOException {
		try {
			System.out.println("뱅킹에 접속합니다");
			throw new SecurityException("보안 프로그램이 작동하지 않습니다.");
		} catch (SecurityException se) {
			IOException ioe = new IOException("비밀번호를 입력할 수 없습니다.");
			ioe.initCause(se);
			throw ioe;
		} 
	}
}


































