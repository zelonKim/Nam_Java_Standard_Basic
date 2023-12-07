package Lambda5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class LambdaEx5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++) list.add(i);

		list.forEach(i -> System.out.print(i+", ")); // 각 요소에 콤마,를 붙여줌.
		System.out.println(); // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
		
		list.removeIf(x -> x%2==0 || x%3==0); // 2의 배수 혹은 3의 배수를 삭제함.
		System.out.println(list); // [1, 5, 7]
		
		list.replaceAll(i -> i*10); // 각 요소에 10을 곱한 후 대체함.
		System.out.println(list); // [10, 50, 70]
	
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
	
	
		map.forEach((K, V) -> System.out.println("{"+ K + ", " + V + "}")); // 각 요소에  중괄호와 콤마 { , }를 붙여줌.
		System.out.println();
		//		{A, 1}
		//		{B, 2}
		//		{C, 3}
		//		{D, 4}

	}

}
