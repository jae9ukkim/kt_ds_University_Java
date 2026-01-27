package com.ktdsuniversity.edu.array;

public class Q2562 {

	public static void main(String[] args) {

		int[] numArr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max = numArr[0]; // Integer.MIN_VALUE
		int idx = 0;
		
		for(int i = 1; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
				idx = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}

}
