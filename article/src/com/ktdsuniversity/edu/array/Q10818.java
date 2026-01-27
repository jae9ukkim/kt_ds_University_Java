package com.ktdsuniversity.edu.array;

public class Q10818 {

	public static void main(String[] args) {

		int[] numArr = {20, 10, 35, 30, 7};
		int min = numArr[0]; // Integer.MAX_VALUE
		int max = numArr[0]; // Integer.MIN_VALUE
		for(int i = 1; i < numArr.length; i++) {
			if(min > numArr[i]) {
				min = numArr[i];
			}
			if(max < numArr[i]) {
				max = numArr[i];
			}
		}
		System.out.println(min + " " + max);
		
	}

}
