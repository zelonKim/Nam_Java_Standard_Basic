package Iterator1;

import java.util.*;

public class IteratorEx1 {
	public static void main(String[] args) {
		// List �о����
		Collection list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		Iterator it = list.iterator(); // Collection.iterator()�޼��带 ���� ���ͷ����� ��ü�� ����.
		
		while(it.hasNext()) { // ���ͷ����� ��ü.hasNext()�� ���� ���� ��Ұ� �ִ��� Ȯ����.
			Object obj = it.next();  // ���ͷ����� ��ü.next()�� ���� ���� ��Ҹ� �о��.
			System.out.print(obj); // ABCDE
		}
		
		/////////////////////////////
		
		
		 // Set �о����
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
			
			
		// Map �о����
		Map map = new HashMap(); // Map�� iterator() �޼��尡 ����.  ->  keySet(), entrySet(), values()�� ���� Collection �������̽��� ��ü�� �������.
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		map.put(5,"E");
		
		
		Collection val = map.values(); // Map.values()�޼��带 ���� Collection���� ��ȯ��.
		Iterator it = val.iterator();
		
		while(it.hasNext()) { 
		Object obj = it.next(); 
		System.out.print(obj); // ABCDE
		}
		
	}
}


















