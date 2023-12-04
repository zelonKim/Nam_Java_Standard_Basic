package TreeSet1;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {

//		Object[] objArr1 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
//		
//		Set set1 = new TreeSet();
//		
//		for(int i=0; i < objArr1.length; i++) {
//			set1.add(objArr1[i]);
//		}
//		
//		System.out.println(set1); // [1, 2, 3, 4] // 중복된 요소는 한번만 저장됨.
		
		
///////////////////////////////////
		
		
//		Object[] objArr2 = {15, 9, 36, 24, 3};
//		
//		Set set2 = new TreeSet();
//		
//		for(int i=0; i < objArr2.length; i++) {
//			set2.add(objArr2[i]);
//		}
//		
//		System.out.println(set2); // [3, 9, 15, 24, 36] // 오름차순으로 정렬되어 저장됨.
//		
		
		
		
		
		
////////////////////////////////////
		
		
		
		
		

//		Set set = new TreeSet(new MyComp());
//		
//		set.add(new Test());
//		set.add(new Test());
//		set.add(new Test());
//		System.out.println(set); // 정상 실행  // [TreeSet1.Test@2a139a55, TreeSet1.Test@15db9742, TreeSet1.Test@6d06d69c]
//				
//	}
//}
//
//class MyComp implements Comparator {
//	public int compare(Object o1, Object o2) {
//		return 1;
//	}
//}
//
//class Test {};

		
////////////////////////////////////
		
		
//		Set set = new TreeSet();
//		
//		set.add(new Test());
//		set.add(new Test());
//		set.add(new Test());
//		System.out.println(set); // 에러 발생 // TreeSet1.Test cannot be cast to java.lang.Comparable
//				
//	}
//}
//
//class Test {};


///////////////////////////////////

//
//	Set set = new TreeSet();
//	
//		set.add(new Test());
//		set.add(new Test());
//		set.add(new Test());
//		System.out.println(set); // 정상 실행   // [TreeSet1.Test@2a139a55, TreeSet1.Test@15db9742, TreeSet1.Test@6d06d69c]
//				
//		}
//	}
//
//class Test implements Comparable {
//	public int compareTo(Object o) {
//		return 1;
//	}
//};


///////////////////////////
		
		

		TreeSet set = new TreeSet();
		
		set.add("apple");
		set.add("bear");
		set.add("cat");
		set.add("dance");
		set.add("elephant");
		set.add("flower");
		
		System.out.println(set.subSet("c", "e")); // [cat, dance]
		System.out.println(set.headSet("cat")); // [apple, bear]
		System.out.println(set.tailSet("cat")); // [cat, dance, elephant, flower]
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
