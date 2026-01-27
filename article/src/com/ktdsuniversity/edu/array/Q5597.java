package com.ktdsuniversity.edu.array;

public class Q5597 {

	public static void main(String[] args) {

		int[] numArr = {3, 1, 4, 5, 7, 9, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		
		int temp = 0;
		// 오름차순 정렬
		for(int i=0; i< numArr.length; i++) {
			for(int j = i + 1; j < numArr.length; j++) {
				if(numArr[i] > numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		
		int cnt = 0;
		for(int i=0; i<30; i++) {
			if(i+1 != numArr[i - cnt]) {
				cnt++;
				System.out.println(i+1);
			}
		}

		int[] numArr2 = {9,30,6,12,10,20,21,11,7,5,28,4,18,29,17,19,27,13,16,26,14,23,22,15,3,1,24,25};
		
		 temp = 0;
		// 오름차순 정렬
		for(int i=0; i< numArr.length; i++) {
			for(int j = i + 1; j < numArr.length; j++) {
				if(numArr[i] > numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		
		cnt = 0;
		for(int i=0; i<30; i++) {
			if(i+1 != numArr[i - cnt]) {
				cnt++;
				System.out.println(i+1);
			}
		}
		
		// 정렬 후 다음 숫자와의 차이가 1인지로 판별? - 두 수가 연속으로 없거나 마지막 숫자가 없다면 검출 불가능
		
		
		
		
		
	}

}
