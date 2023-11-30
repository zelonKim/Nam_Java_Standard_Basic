package String1;

import java.util.Date;

/*
public class StringEx1 {
	public static void main(String[] args) {
		String str1 = "abc"; // "문자열"
		String str2 = "abc";
		System.out.println(str1 == str2); // true // 내용이 같을 경우, 새로운 객체를 생성하지 않음.
	}
}
*/

/*
public class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");  // new String("문자열")
		String str2 = new String("abc");
		System.out.println(str1 == str2); // false  // 내용이 같더라도, 새로운 객체를 생성함.
	}
}
*/


/////////////////////////////



/*
public class StringEx1 {
	public static void main(String[] args) {
		String a = new String("A");
		String b = new String("B");
		
		String mixed = a.concat(b);
		
		System.out.println(a); // A
		System.out.println(mixed); // AB

	}
}
*/

/*
public class StringEx1 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		
		StringBuffer mixed = a.append(b);
		
		System.out.println(a); // AB
		System.out.println(mixed); // AB

	}
}
*/



/////////////////////////////




public class StringEx1 {
	public static void main(String[] args) {
//		String s = "Hello".concat(" World");
//		System.out.println(s); // Hello World
		
//		boolean b = "abcde".contains("bc");
//		System.out.println(b); // true
		
//		boolean b = "Hello.txt".endsWith("txt");
//		System.out.println(b); // true
		
//		boolean b = "appleMac".startsWith("apple");
//		System.out.println(b); // true
		
		
		
//		boolean b = "Hello".equals("Hello");
//		System.out.println(b); // true
		
//		boolean b = "Hello".equals("hello");
//		System.out.println(b); // false
		
		
		
//		boolean b = "Hello".equalsIgnoreCase("Hello");
//		System.out.println(b); // true
		
//		boolean b = "Hello".equalsIgnoreCase("hello");
//		System.out.println(b); // true		
		

//		int idx1 = "Hello".indexOf('e');
//		System.out.println(idx1); // 1

//		int idx2 = "Hello".indexOf('y');
//		System.out.println(idx2); // -1
		
		

//		int idx1 = "Hello".indexOf('e', 1);
//		System.out.println(idx1); // 1
//		
//		int idx2 = "Hello".indexOf('e', 2);
//		System.out.println(idx2); // -1
		
		
//		int idx = "ABCDEF".indexOf("BC");
//		System.out.println(idx); // 1
		
//		int idx = "java.lang.java".lastIndexOf('.');
//		System.out.println(idx); // 9
		
		
//		int idx = "java.lang.java".lastIndexOf("java");
//		System.out.println(idx); // 10
		
//		int i = "Hello".length();
//		System.out.println(i); // 5
		
		
//		String[] arr = "dog,cat,bear".split(",", 2);
//		System.out.println(arr[0]); // dog
//		System.out.println(arr[1]); // cat,bear

		
//		String s1 = "java.lang.Object".substring(10);
//		System.out.println(s1); // Object
//		
//		String s2 = "java.lang.Object".substring(5,9);
//		System.out.println(s2); // lang
		
		
//		String b = String.valueOf(true);
//		System.out.println(b); // "true"
//		
//		String c = String.valueOf('a');
//		System.out.println(c); // "a"
//		
//		String i = String.valueOf(100);
//		System.out.println(i); // "100"
//		
//		String l = String.valueOf(100L);
//		System.out.println(l); // "100"
//		
//		String f = String.valueOf(10f);
//		System.out.println(f); // "10.0"
//		
//		String d = String.valueOf(10.0);
//		System.out.println(d); // "10.0"
//		
//		String date = String.valueOf(new Date());
//		System.out.println(date); // "Thu Nov 30 15:21:28 KST 2023"
		

//		String[] strArr = {"dog","cat","bear"};
//		String joinedStr = String.join("-", strArr);
//		System.out.println(joinedStr); // dog-cat-bear
		
//		StringBuffer sb1 = new StringBuffer("abc");
//		StringBuffer sb2 = new StringBuffer("abc");
//		System.out.println(sb1.equals(sb2)); // false // 주소 비교
//		
//		
//		String s1 = sb1.toString();
//		String s2 = sb2.toString();
//		System.out.println(s1.equals(s2)); // true  // 내용 비교
		
		
//		StringBuffer sb1 = new StringBuffer("abc");
//		StringBuffer sb2 = sb1.append("de");
//		StringBuffer sb3 = sb2.append(10.0f);
//		
//		System.out.println(sb1); // abcde10.0
//		System.out.println(sb2); // abcde10.0
//		System.out.println(sb3); // abcde10.0
		
//		StringBuffer sb = new StringBuffer(100);
//		sb.append("abcde");
//		System.out.println(sb.capacity()); // 100
//		System.out.println(sb.length()); // 5

//		StringBuffer sb = new StringBuffer("abcde");
//		char c = sb.charAt(1);
//		System.out.println(c); // b
		
//		StringBuffer sb = new StringBuffer("abcde");
//		sb.delete(1, 3); 
//		System.out.println(sb); // ade
	
//		StringBuffer sb = new StringBuffer("abcde");
//		sb.deleteCharAt(1);
//		System.out.println(sb); // acde

//		StringBuffer sb = new StringBuffer("abcde");
//		sb.insert(1, 'z');
//		System.out.println(sb); // azbcde
	
	
//		StringBuffer sb = new StringBuffer("abcde");
//		sb.replace(1, 3, "xyz");
//		System.out.println(sb); // axyzde
	
//		StringBuffer sb = new StringBuffer("abcde");
//		sb.reverse();
//		System.out.println(sb); // edcba
	
		
//		StringBuffer sb = new StringBuffer("abcde");
//		sb.setCharAt(1, 'z');
//		System.out.println(sb); // azcde

		
//		StringBuffer sb = new StringBuffer("abcde");
//		sb.setLength(2);
//		System.out.println(sb); // ab
		
		
//		StringBuffer sb = new StringBuffer("abcde");
//		String str = sb.toString();
//		System.out.println(str); // "abcde"
		
		
//		StringBuffer sb = new StringBuffer("abcde");
//		String str1 = sb.substring(1); 
//		String str2 = sb.substring(1, 3); 
//		
//		System.out.println(str1); // bcde
//		System.out.println(str2); // bc
		

		
	}
	
}


















