package Comparator1;

import java.util.*;


public class ComparatorEx1 {

	public static void main(String[] args) {
		String [] strArr = {"cat", "Dog", "ant", "bear"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr)); // [Dog, ant, bear, cat] // �빮�ڰ� ���� ���� ������, �ҹ��ڸ� ������������ ������.
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr)); // [ant, bear, cat, Dog] // ��ҹ��ڿ� ������� ������������ ������.
		
		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr)); // [cat, bear, ant, Dog] // �ҹ��ڸ� ������������ �����ϰ� ����, �빮�ڰ� ���� �������� ��.
	}

}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // -1�� ���ؼ� ���� ���ļ����� �ݴ�� ������.
		}
		return -1;
	}
}