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
//		System.out.println(set); // [1, 1, 2, 3, 4] // �ߺ��� ��Ҵ� �ѹ��� �����. (��, String 1�� Integer 1�� �ٸ� �����.)           
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
//		System.out.println(set); // [16, 1, 4, 21, 7, 29] // ��Ұ� ���ĵ��� ����. (���� X)
//		
//		List list = new LinkedList(set); // LinkedList(Collection c): �־��� �÷���(c)�� ��ü�� ��� LinkedList�� ������.
//		Collections.sort(list); // Collections.sort(List l): �־��� ����Ʈ(l)�� ������ ���� ������.
//		System.out.println(list); // [1, 4, 7, 16, 21, 29]
		
		
		
		
		
///////////////////////////////////////////////
		
		
		
		
		
//		HashSet set = new HashSet();
//		set.add(new Person("David", 10));
//		set.add(new Person("David", 10));
//		
//		System.out.println(set); // [David:10, David:10]  // Person ��ü�� '�ּ�'�� ����. -> ���� �ٸ� ��ҷ� ���ֵ�.(�ߺ� ó������ ����.)
//	}
//}
//
//class Person { // Object.equals()�� Object.hashCode()�� �������̵� ���� ����.
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
//	public int hashCode() { // Object.hashCode()�� �������̵� ����.
//		return Objects.hash(name, age);
//	}
//	
//	public boolean equals(Object obj) { // Object.equals()�� �������̵� ����.
//		if(!(obj instanceof Person)) return false;
//		
//		Person p = (Person)obj;
//		return this.name.equals(p.name) && this.age == p.age; // Person ��ü�� '����'�� ����. -> ���� ���� ��ҷ� ���ֵ�. (�ߺ� ó����.)
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
		
		
		// ������
		Iterator it1 = setB.iterator();
		while(it1.hasNext()) {
			Object tmp = it1.next();
			if(setA.contains(tmp)) setGyo.add(tmp);
		}
		System.out.println(setGyo); // [4, 5]
		
//		setA.retainAll(setB);
//		System.out.println(setA); // [4, 5]
		
		
		
		// ������
		Iterator it2 = setA.iterator();
		while(it2.hasNext()) {
			Object tmp = it2.next();
			if(!setB.contains(tmp)) setCha.add(tmp);
		}
		System.out.println(setCha); // [1, 2, 3]
		
//		setA.removeAll(setB);
//		System.out.println(setA); // [1, 2, 3]
		
		
		
		// ������
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



























