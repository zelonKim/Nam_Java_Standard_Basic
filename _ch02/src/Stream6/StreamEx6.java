package Stream6;

import java.util.Optional;
import java.util.OptionalInt;

public class StreamEx6 {
	public static void main(String[] args) {
//		Optional<String> optStr = Optional.of("abcde");
//		Optional<Integer> optInt = optStr.map(s -> s.length());
//		
//		System.out.println(optStr.get()); // abcde
//		System.out.println(optInt.get()); // 5
		
		////////////////
		
//		int result1 = Optional.of("123").filter(x -> x.length() > 0).map(Integer::parseInt).get();
//		int result2 = Optional.of("").filter(x -> x.length() > 0).map(Integer::parseInt).orElse(-1);
//		
//		System.out.println(result1); // 123
//		System.out.println(result2); // -1
		
		/////////////////
		
//		Optional.of("123").map(Integer::parseInt).ifPresent(x -> System.out.print(x)); // 123
		
		/////////////////
		
		OptionalInt optI1 = OptionalInt.of(0);
		OptionalInt optI2 = OptionalInt.empty();
		
//		System.out.println(optI1.getAsInt()); // 0
//		System.out.println(optI2.getAsInt()); // 예외 발생
		
//		System.out.println(optI1.isPresent()); // true
//		System.out.println(optI2.isPresent()); // false
		
		System.out.println(optI1.equals(optI2)); // false
	}

}
