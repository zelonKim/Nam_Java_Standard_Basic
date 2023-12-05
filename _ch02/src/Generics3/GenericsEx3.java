package Generics3;

import java.util.*;

class Student {
	int kor;
	int eng;
	int math;
	
	Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}


public class GenericsEx3 {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>(); // 생성자의 타입변수는 생략 가능
		
		map.put("김철수", new Student(100, 80, 90));
		Student s = map.get("김철수"); 
		System.out.println(s.kor); // 100
	}

}
