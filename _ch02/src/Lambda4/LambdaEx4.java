package Lambda4;

import java.util.function.*;

public class LambdaEx4 {
		public static void main(String[] args) {
			// Function<�Ű����� Ÿ��, ��ȯ Ÿ��>
			Function<String, Integer>	f  = (s) -> Integer.parseInt(s, 16); // ���ڿ��� 16���� int�� ������.
			Function<Integer, String>	g  = (i) -> Integer.toBinaryString(i); // int�� 2���� ���ڿ��� ������.

			Function<String, String>    h1  = f.andThen(g); // f�Լ� + g�Լ�
			Function<Integer, Integer>  h2 = f.compose(g); // g�Լ� + f�Լ�

			
			System.out.println(h1.apply("FF")); // "FF" �� 255 �� "11111111" ���
			System.out.println(h2.apply(2));   // 2 �� "10" �� 16 ���

			Function<String, String> f2 = x -> x; // �׵� �Լ�(identity function)
			System.out.println(f2.apply("AAA"));  // AAA ���

			
			Predicate<Integer> p = i -> i < 100;
			Predicate<Integer> q = i -> i < 200;
			Predicate<Integer> r = i -> i%2 == 0;
			Predicate<Integer> notP = p.negate(); // i >= 100

			Predicate<Integer> all = notP.and(q.or(r));
			System.out.println(all.test(150));       // true

			
			String str1 = "abc";
			String str2 = "abc";
			
			// str1�� str2�� ������ ���� ����� ��ȯ
			Predicate<String> p2 = Predicate.isEqual(str1); 
			boolean result = p2.test(str2);   
			System.out.println(result); // true
		}
	}
