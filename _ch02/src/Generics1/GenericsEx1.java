package Generics1;

import java.util.ArrayList;
import java.util.List;

//public class GenericsEx1 {
//	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add("30");
//		System.out.println(list); // ���� ����  // [10, 20, 30]
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add("30");
//		System.out.println(list); // ���� �߻� // The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)

		
/////////////////////////////////////////////
		
		
		
		
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		Integer i = list.get(2); 
//		System.out.println(i); // ���� �߻�  // Type mismatch: cannot convert from Object to Integer
		
		
		//////////////////////
		
		
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		Integer i = (Integer)list.get(2); 
//		System.out.println(i); // ���� ����  // 30
		
		
		/////////////////////
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		Integer i = list.get(2); // ���׸����� ����  ����ȯ ���� ����
//		System.out.println(i); // ���� ����  // 30
		
		

//////////////////////////////////////
		
		

class Product {}
class Tv extends Product {}		
class Audio extends Product {}		
		
		
public class GenericsEx1 {
	public static void main(String[] args) {
//		ArrayList<Product> tvList = new ArrayList<Tv>(); // ���� �߻�  // Type mismatch: cannot convert from ArrayList<Tv> to ArrayList<Product>
		
//		List<Tv> tvList = new ArrayList<Tv>(); // ���� ����
		
		ArrayList<Product> productList = new ArrayList<Product>(); // public class ArrayList<E> 
		productList.add(new Tv()); // ���� ����  // public boolean add(E e) {
		productList.add(new Audio());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
