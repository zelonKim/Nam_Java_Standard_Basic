package Iterator1;

import java.util.*;

public class IteratorEx1 {
	public static void main(String[] args) {
		// List 읽어오기
		Collection list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		Iterator it = list.iterator(); // Collection.iterator()메서드를 통해 이터레이터 객체를 얻어옴.
		
		while(it.hasNext()) { // 이터레이터 객체.hasNext()를 통해 다음 요소가 있는지 확인함.
			Object obj = it.next();  // 이터레이터 객체.next()를 통해 다음 요소를 읽어옴.
			System.out.print(obj); // ABCDE
		}
		
		/////////////////////////////
		
		
		 // Set 읽어오기
		Collection set = new HashSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		Iterator it = set.iterator(); 
		
		while(it.hasNext()) { 
			Object obj = it.next(); 
			System.out.print(obj); // ABCDE
		}
			
		//////////////////////////////
			
			
		// Map 읽어오기
		Map map = new HashMap(); // Map은 iterator() 메서드가 없음.  ->  keySet(), entrySet(), values()를 통해 Collection 인터페이스의 객체로 만들어줌.
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		map.put(5,"E");
		
		
		Collection val = map.values(); // Map.values()메서드를 통해 Collection으로 변환함.
		Iterator it = val.iterator();
		
		while(it.hasNext()) { 
		Object obj = it.next(); 
		System.out.print(obj); // ABCDE
		}
		
	}
}


















