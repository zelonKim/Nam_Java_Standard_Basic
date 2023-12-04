package HashSet1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
	public static void main(String[] args) {
//		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "3", "4", "4", "4", "4" };
//		
//		Set set = new HashSet();
//		
//		for(int i=0; i < objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		
//		System.out.println(set); // [1, 1, 2, 3, 4] // 중복된 요소는 한번만 저장됨. (단, String 1과 Integer 1은 다른 요소임.)           
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			System.out.print(it.next()); // 11234
//		}
	
		
	//////////////////////////////////
		
		
//		Set set = new HashSet();
//		
//		for (int i = 0; set.size() < 6; i++) {
//			int num = (int)(Math.random()*50) + 1;
//			set.add(num);
//		}
//		
//		System.out.println(set); // [16, 1, 4, 21, 7, 29] // 요소가 정렬되지 않음. (순서 X)
//		
//		List list = new LinkedList(set); // LinkedList(Collection c): 주어진 컬렉션(c)의 객체가 담긴 LinkedList를 생성함.
//		Collections.sort(list); // Collections.sort(List l): 주어진 리스트(l)를 순서에 따라 정렬함.
//		System.out.println(list); // [1, 4, 7, 16, 21, 29]
		
		
		
		
		
///////////////////////////////////////////////
		
		
		
		
		
//		HashSet set = new HashSet();
//		set.add(new Person("David", 10));
//		set.add(new Person("David", 10));
//		
//		System.out.println(set); // [David:10, David:10]  // Person 객체의 '주소'를 비교함. -> 서로 다른 요소로 간주됨.(중복 처리되지 않음.)
//	}
//}
//
//class Person { // Object.equals()와 Object.hashCode()를 오버라이딩 하지 않음.
//	String name;
//	int age;
//	
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String toString() {
//		return name+":"+age;
//	}
//}
		
		
///////////////////////////////////////////
		
		
		
//		HashSet set = new HashSet();
//		set.add(new Person("David", 10));
//		set.add(new Person("David", 10));
//		
//		System.out.println(set); // [David:10]
//
//	}
//}
//
//class Person {
//	String name;
//	int age;
//	
//	
//	public int hashCode() { // Object.hashCode()를 오버라이딩 해줌.
//		return Objects.hash(name, age);
//	}
//	
//	public boolean equals(Object obj) { // Object.equals()를 오버라이딩 해줌.
//		if(!(obj instanceof Person)) return false;
//		
//		Person p = (Person)obj;
//		return this.name.equals(p.name) && this.age == p.age; // Person 객체의 '내용'을 비교함. -> 서로 같은 요소로 간주됨. (중복 처리됨.)
//	} 
//	
//	
//	
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String toString() {
//		return name+":"+age;
//	
//	}
//}

		////////////////////////////
		
		
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setGyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println(setA); // [1, 2, 3, 4, 5]
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println(setB); // [4, 5, 6, 7, 8]
		
		
		// 교집합
		Iterator it1 = setB.iterator();
		while(it1.hasNext()) {
			Object tmp = it1.next();
			if(setA.contains(tmp)) setGyo.add(tmp);
		}
		System.out.println(setGyo); // [4, 5]
		
//		setA.retainAll(setB);
//		System.out.println(setA); // [4, 5]
		
		
		
		// 차집합
		Iterator it2 = setA.iterator();
		while(it2.hasNext()) {
			Object tmp = it2.next();
			if(!setB.contains(tmp)) setCha.add(tmp);
		}
		System.out.println(setCha); // [1, 2, 3]
		
//		setA.removeAll(setB);
//		System.out.println(setA); // [1, 2, 3]
		
		
		
		// 합집합
		Iterator it3 = setA.iterator();
		while(it3.hasNext())
			setHab.add(it3.next());
		
		Iterator it4 = setB.iterator();
		while(it4.hasNext())
			setHab.add(it4.next());
		
		System.out.println(setHab);// [1, 2, 3, 4, 5, 6, 7, 8]
		
//		setA.addAll(setB);
//		System.out.println(setA); // [1, 2, 3, 4, 5, 6, 7, 8]
	
		////////////////////////////
		
		
		
	}
}



























