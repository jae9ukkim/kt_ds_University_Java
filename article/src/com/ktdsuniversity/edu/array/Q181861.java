package com.ktdsuniversity.edu.array;

public class Q181861 {

	public static void main(String[] args) {

		int[] arr = {5, 1, 4};
		
		// 반환할 배열의 길이는 주어진 배열의 원소 합과 같다
		int resultLen = 0;
		for(int i = 0; i< arr.length; i++) {
			resultLen += arr[i];
		}
		int[] result = new int[resultLen];
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j=0; j < arr[i]; j++) {
//				if(i != 0 || j != 0) {
//					System.out.print(", ");
//				}
//				System.out.print(arr[i]);
//			}
//		}
//		System.out.println();
		for(int i = arr.length - 1; i >= 0; i--) {
			for(int j=0; j < arr[i] ; j++) {
				result[resultLen-1] = arr[i];
				resultLen--;
			}
		}
		for(int i = 0; i < result.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(result[i]);	
		}
		System.out.println();
		
		

		int[] arr2 = {6, 6};
		for(int i = 0; i < arr2.length; i++) {
			for(int j=0; j < arr2[i]; j++) {
				if(i != 0 || j != 0) {
					System.out.print(", ");
				}
				System.out.print(arr2[i]);
			}
		}
		System.out.println();

		int[] arr3 = {1};
		for(int i = 0; i < arr3.length; i++) {
			for(int j=0; j < arr3[i]; j++) {
				if(i != 0 || j != 0) {
					System.out.print(", ");
				}
				System.out.print(arr3[i]);
			}
		}
		System.out.println();
		
	}

}
