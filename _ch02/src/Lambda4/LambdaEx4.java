package Lambda4;

import java.util.function.*;

public class LambdaEx4 {
		public static void main(String[] args) {
			// Function<매개변수 타입, 반환 타입>
			Function<String, Integer>	f  = (s) -> Integer.parseInt(s, 16); // 문자열을 16진수 int로 변경함.
			Function<Integer, String>	g  = (i) -> Integer.toBinaryString(i); // int를 2진수 문자열로 변경함.

			Function<String, String>    h1  = f.andThen(g); // f함수 + g함수
			Function<Integer, Integer>  h2 = f.compose(g); // g함수 + f함수

			
			System.out.println(h1.apply("FF")); // "FF" → 255 → "11111111" 출력
			System.out.println(h2.apply(2));   // 2 → "10" → 16 출력

			Function<String, String> f2 = x -> x; // 항등 함수(identity function)
			System.out.println(f2.apply("AAA"));  // AAA 출력

			
			Predicate<Integer> p = i -> i < 100;
			Predicate<Integer> q = i -> i < 200;
			Predicate<Integer> r = i -> i%2 == 0;
			Predicate<Integer> notP = p.negate(); // i >= 100

			Predicate<Integer> all = notP.and(q.or(r));
			System.out.println(all.test(150));       // true

			
			String str1 = "abc";
			String str2 = "abc";
			
			// str1과 str2가 같은지 비교한 결과를 반환
			Predicate<String> p2 = Predicate.isEqual(str1); 
			boolean result = p2.test(str2);   
			System.out.println(result); // true
		}
	}
