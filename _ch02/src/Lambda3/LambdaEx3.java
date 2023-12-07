package Lambda3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx3 {
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			list.add(s.get()); // public interface Supplier<T> { T get(); }
		}
	}
	
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i: list) {
			if(p.test(i)) c.accept(i);
		}
		System.out.println("]");
	}
	
	
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
	 
		for(T i: list) {  
			newList.add(f.apply(i));
		}
		return newList;
	}
	
	
	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100) + 1; // 1 ~ 100 사이의 랜덤 값 생성하기
		Predicate<Integer> p = i -> i%2 == 0; // 짝수 골라내기
		Consumer<Integer> c = i -> System.out.print(i+", "); 
		Function<Integer, Integer> f = i -> i/10*10; // 일의 자리 제거하기
		
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list); // [56, 40, 61, 38, 1, 20, 96, 33, 2, 36]
		
		
		printEvenNum(p, c, list); // [56, 40, 38, 20, 96, 2, 36, ]

		
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList); // [50, 40, 60, 30, 0, 20, 90, 30, 0, 30]

	}
	
	
	
	
}
