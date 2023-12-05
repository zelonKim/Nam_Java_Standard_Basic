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
//		Iterator it = list.iterator(); // 제네릭스를 사용하지 않음.
//		while(it.hasNext()) {
//			Student s = (Student)it.next(); // 형변환 해줘야 함.
//			System.out.print(s.name); // 정상 실행  // ABC
//		}
		
		///////////////////////////////
		
		
		ArrayList list = new ArrayList();
		list.add(new Student("A", 1, 15));
		list.add(new Student("B", 2, 12));
		list.add(new Student("C", 3, 24));
		
		
		Iterator<Student> it = list.iterator(); // 제네릭스를 사용함.  
		while(it.hasNext()) {
			Student s = it.next(); // 형변환 해주지 않아도 됨.
			System.out.print(s.name); // 정상 실행  // ABC
	
		
		}
		
	}

}
