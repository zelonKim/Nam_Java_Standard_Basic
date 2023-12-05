package Generics2;

import java.util.*;

class Student {
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}


public class GenericsEx2 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(new Student("A", 1, 15));
//		list.add(new Student("B", 2, 12));
//		list.add(new Student("C", 3, 24));
//		
//		
//		Iterator it = list.iterator(); // ���׸����� ������� ����.
//		while(it.hasNext()) {
//			Student s = (Student)it.next(); // ����ȯ ����� ��.
//			System.out.print(s.name); // ���� ����  // ABC
//		}
		
		///////////////////////////////
		
		
		ArrayList list = new ArrayList();
		list.add(new Student("A", 1, 15));
		list.add(new Student("B", 2, 12));
		list.add(new Student("C", 3, 24));
		
		
		Iterator<Student> it = list.iterator(); // ���׸����� �����.  
		while(it.hasNext()) {
			Student s = it.next(); // ����ȯ ������ �ʾƵ� ��.
			System.out.print(s.name); // ���� ����  // ABC
	
		
		}
		
	}

}
