package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		System.out.println(list1); // [5, 4, 2, 0, 1, 3]

		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list2); // [4, 2, 0]
		
		// Collections 유틸 클래스
		Collections.sort(list1); // 오름차순으로 정렬함.
		System.out.println(list1); // [0, 1, 2, 3, 4, 5]
		
		System.out.println(list1.containsAll(list2)); // true
		
		list1.add("A");
		list1.add("B");
		list1.add(2, "C");
		System.out.println(list1); // [0, 1, C, 2, 3, 4, 5, A, B]
		
		list1.set(1, "AA");
		System.out.println(list1); // [0, AA, C, 2, 3, 4, 5, A, B]
		
		System.out.println(list1.indexOf("A")); // 7
		
		list1.remove(3);
		System.out.println(list1); // [0, AA, C, 3, 4, 5, A, B]
		
		list1.remove("AA");
		System.out.println(list1); // [0, C, 3, 4, 5, A, B]
		
		list1.retainAll(list2);
		System.out.println(list1); // [0, 4]
		


		
		
	}

}
