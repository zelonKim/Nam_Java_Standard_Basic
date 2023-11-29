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
				System.out.println("AE �߻�");
				System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOOBE �߻�");
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
				System.out.println("AE �߻�");
				System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("AIOOBE �߻�");
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
				System.out.println("AE �߻�");
				System.out.println(4);
		} catch (Exception e) {
			System.out.println("E �߻�");
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
			Exception e = new Exception("�߻��� ���ܰ� �ֽ��ϴ�."); // ���� Ŭ������  ���� ��ü�� = new ���� Ŭ������("���� �޽���");
			throw e;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}
}
// �߻��� ���ܰ� �ֽ��ϴ�.
// ���α׷��� ���� ����Ǿ����ϴ�.
*/


/////////////////////////////



/*

// ���ܸ� ���ѱ��� ���� ���
public class ExceptionEx1 {
	public static void main(String[] args) {
			File f = createFile("");
				if(f != null) {
				System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
			}
		}

	
	static File createFile(String fileName)  {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("���ϸ��� ��ȿ���� �ʾƼ�"); // 1. ���ϸ��� �߸��Ǿ�, ���ܸ� �߻���Ŵ.
			File f = new File(fileName);
			f.createNewFile();
			return f;
		} catch(Exception e) { // 2. �߻��� ���ܸ� ó����.
			System.out.println(e.getMessage()+" ���� ������ �Ұ��մϴ�."); 
			return null;
		}
		
	}
}
// ���ϸ��� ��ȿ���� �ʾƼ� ���� ������ �Ұ��մϴ�.
*/

//////////////////////////////////

/*
// ���ܸ� ���ѱ� ���
public class ExceptionEx1 {
	public static void main(String[] args) {
		try { // 3. ���Ѱ� ���� ���ܸ� ó����.
			File f = createFile(""); 
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		} catch(Exception e) {
			System.out.println(e.getMessage()+" ���� ������ �Ұ��մϴ�.");
		}
	}

	static File createFile(String fileName) throws Exception { // 2. �߻��� ���ܸ� �޼��带 ȣ���ߴ� ������ ���ѱ�
		if (fileName==null || fileName.equals(""))
			throw new Exception("���ϸ��� ��ȿ���� �ʾƼ�"); // 1. ���ϸ��� �߸��Ǿ�, ���ܸ� �߻���Ŵ.
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}
// ���ϸ��� ��ȿ���� �ʾƼ� ���� ������ �Ұ��մϴ�.
*/


/////////////////////////////////////


/*
 
// ���� ���� ó���ϱ�
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) { //5. ���Ѱ� ���� �ι�° ���ܸ� ó����.
			System.out.println(" ���� ������ �Ұ��մϴ�.");
		}
	}

	
	static File createFile(String fileName) throws Exception { // 4. �޼��带 ȣ���� ������ �ι�° ���ܸ� ���ѱ�.
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("���ϸ��� ��ȿ���� �ʾƼ�"); // 1. ���ϸ��� �߸��Ǿ�, ù��° ���ܸ� �߻���Ŵ.
			File f = new File(fileName);
			f.createNewFile();
			return f;
		} catch(Exception e) { // 2. �߻��� ù���� ���ܸ� ó����.
			System.out.print(e.getMessage());
			throw e; // 3. �ι�° ���ܸ� �߻���Ŵ.
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
			System.out.println("����:" + ioe.getCause());
		}
	}
	
	static void secret() throws IOException {
		try {
			System.out.println("��ŷ�� �����մϴ�");
			throw new SecurityException("���� ���α׷��� �۵����� �ʽ��ϴ�.");
		} catch (SecurityException se) {
			IOException ioe = new IOException("��й�ȣ�� �Է��� �� �����ϴ�.");
			ioe.initCause(se);
			throw ioe;
		} 
	}
}


































