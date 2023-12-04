package Collections1;


import java.util.*;
import static java.util.Collections.*;

public class CollectionsEx1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list); // []
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list); // [1, 2, 3, 4, 5]
		
		rotate(list, 2); 
		System.out.println(list); // [4, 5, 1, 2, 3]

		swap(list, 0, 2);
		System.out.println(list); // [1, 5, 4, 2, 3]
		
		shuffle(list);
		System.out.println(list); // [4, 2, 5, 3, 1]
		
		sort(list, reverseOrder());
		System.out.println(list); // [5, 4, 3, 2, 1]
		
		sort(list);
		System.out.println(list); // [1, 2, 3, 4, 5]
		
		int idx = binarySearch(list, 3);
		System.out.println(idx); // 2
		
		System.out.println(max(list)); // 5
		
		System.out.println(min(list)); // 1
		
		
		fill(list, 9);
		System.out.println(list); // [9, 9, 9, 9, 9]
		
		List newList = nCopies(list.size(), 5);
		System.out.println(newList); // [5, 5, 5, 5, 5]
		
		System.out.println(disjoint(list, newList)); // true
		
		copy(list, newList);
		System.out.println(newList);  // [5, 5, 5, 5, 5]
		System.out.println(list); // [5, 5, 5, 5, 5]
		
		replaceAll(list, 2, 1);
		System.out.println(list); // [5, 5, 5, 5, 5]
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		System.out.println(list2); // [5, 5, 5, 5, 5]
		
		
		
		
	}

}




















