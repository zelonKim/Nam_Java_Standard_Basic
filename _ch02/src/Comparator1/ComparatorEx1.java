package Comparator1;

import java.util.*;


public class ComparatorEx1 {

	public static void main(String[] args) {
		String [] strArr = {"cat", "Dog", "ant", "bear"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr)); // [Dog, ant, bear, cat] // 대문자가 제일 먼저 오고나서, 소문자를 오름차순으로 정렬함.
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr)); // [ant, bear, cat, Dog] // 대소문자에 상관없이 오름차순으로 정렬함.
		
		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr)); // [cat, bear, ant, Dog] // 소문자를 내림차순으로 정렬하고 나서, 대문자가 제일 마지막에 옴.
	}

}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // -1을 곱해서 기존 정렬순서와 반대로 정렬함.
		}
		return -1;
	}
}