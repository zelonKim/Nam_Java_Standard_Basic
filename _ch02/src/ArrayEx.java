import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
//		int[] score = new int[5];
//		score[3] = 100;
//				
//		for (int i=0; i<score.length; i++) {
//		  System.out.println(score[i]);
//		}

//		int[] score = {60, 70, 80, 90, 100};
//		System.out.println(score); // [I@2a139a55
//		System.out.println(Arrays.toString(score)); // [60, 70, 80, 90, 100]
		
		
		
		
//		String str = "ABCDE";
//		
//		System.out.println(str.charAt(3)); // D
//		
//		System.out.println(str.length()); // 5
//		
//		System.out.println(str.substring(1,3)); // BC
//		
//		System.out.println(str.substring(1)); // BCDE
//		
//		System.out.println(str.equals("ABCDE")); // true
//		
//		System.out.println(str.equals("ABCD")); // false 
//		
//		System.out.println(str.toCharArray()); // ABCDE
		
		
		
		
		int[] arr1 = {0,1,2,3,4};
		System.out.println(Arrays.toString(arr1)); // [0, 1, 2, 3, 4]
		
		int[] arr2 = {5,6,7,8,9};
		System.out.println(Arrays.equals(arr1, arr2)); // false
		
		int[] arr3 = Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(arr3)); // [0, 1, 2]
		
		int[] arr4 = Arrays.copyOfRange(arr1, 1, 4);
		System.out.println(Arrays.toString(arr4)); // [1, 2, 3]
		
		int[] arr5 = {20,15,5,10};
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
	}

}
