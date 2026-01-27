package com.ktdsuniversity.edu.array;

public class Q181853 {
	
	public static void main(String[] args) {
		
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		int temp = 0;
		
		// 오름차순 정렬
		for(int i=0; i< num_list.length; i++) {
			for(int j = i + 1; j < num_list.length; j++) {
				if(num_list[i] > num_list[j]) {
					temp = num_list[i];
					num_list[i] = num_list[j];
					num_list[j] = temp;
				}
			}
		}
		for(int i = 0; i< 5; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(num_list[i]);
		}
		
	}
}
