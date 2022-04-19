package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		int length = arr.length;
		for (int i = arr[0]; i < length; i++) {
			int a = arr[i];
			int b = i;
			int c = a - 1;
			if (b != c) {
				System.out.println("Missing Number:"+c);
				break;
			}
		}
	}
}
