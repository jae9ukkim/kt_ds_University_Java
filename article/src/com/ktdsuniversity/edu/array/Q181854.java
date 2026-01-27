package com.ktdsuniversity.edu.array;

public class Q181854 {

	private static void printArr(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
	
	private static int[] addOddIdx(int[] arr, int n) {
		for(int i=0; i< arr.length; i++) { // i가 1부터 시작해서 2씩 증가시키면 if문 불필요
			if(i % 2 != 0) {
				arr[i] += n;
			}
		}
		
		return arr;
	}
	
	private static int[] addEvenIdx(int[] arr, int n) {
		for(int i=0; i< arr.length; i++) {// 2씩 증가시키면 if문 불필요
			if(i % 2 == 0) {
				arr[i] += n;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		if(arr.length % 2 == 0) {
			arr = addOddIdx(arr, n);
		} else {
			arr = addEvenIdx(arr, n);
		}
		printArr(arr);
		
		
		int[] arr2 = {444, 555, 666, 777};
		n = 100;
		if(arr2.length % 2 == 0) {
			arr2 = addOddIdx(arr2, n);
		} else {
			arr2 = addEvenIdx(arr2, n);
		}
		
		printArr(arr2);
	}
	

}
