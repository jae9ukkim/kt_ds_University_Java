package com.ktdsuniversity.edu.array;

public class Q181856 {

	private static void arrCompare(int[] arr1, int[] arr2) {
		if(arr1.length == arr2.length) {
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0; i < arr1.length; i++) {
				sum1 += arr1[i];
				sum2 += arr2[i];
			}
			if(sum1 == sum2) {
				System.out.println(0);
			} else if(sum1 > sum2) {
				System.out.println(1);
			} else {
				System.out.println(-1);
			}
			
		} else if(arr1.length > arr2.length) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}
		
	}

	public static void main(String[] args) {

		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};
		arrCompare(arr1, arr2);
		
		int[] arr3 = {100, 17, 84, 1};
		int[] arr4 = {55, 12, 65, 36};
		arrCompare(arr3, arr4);
		
		int[] arr5 = {1, 2, 3, 4, 5};
		int[] arr6 = {3, 3, 3, 3, 3};
		arrCompare(arr5, arr6);
	}


}
