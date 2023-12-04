package Generics1;

import java.util.ArrayList;
import java.util.List;

//public class GenericsEx1 {
//	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add("30");
//		System.out.println(list); // 정상 실행  // [10, 20, 30]
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add("30");
//		System.out.println(list); // 에러 발생 // The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)

		
/////////////////////////////////////////////
		
		
		
		
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		Integer i = list.get(2); 
//		System.out.println(i); // 에러 발생  // Type mismatch: cannot convert from Object to Integer
		
		
		//////////////////////
		
		
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		Integer i = (Integer)list.get(2); 
//		System.out.println(i); // 정상 실행  // 30
		
		
		/////////////////////
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		Integer i = list.get(2); // 제네릭스를 통해  형변환 생략 가능
//		System.out.println(i); // 정상 실행  // 30
		
		

//////////////////////////////////////
		
		

class Product {}
class Tv extends Product {}		
class Audio extends Product {}		
		
		
public class GenericsEx1 {
	public static void main(String[] args) {
//		ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러 발생  // Type mismatch: cannot convert from ArrayList<Tv> to ArrayList<Product>
		
//		List<Tv> tvList = new ArrayList<Tv>(); // 정상 실행
		
		ArrayList<Product> productList = new ArrayList<Product>(); // public class ArrayList<E> 
		productList.add(new Tv()); // 정상 실행  // public boolean add(E e) {
		productList.add(new Audio());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
