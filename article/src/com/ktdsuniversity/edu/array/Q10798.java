package com.ktdsuniversity.edu.array;

public class Q10798 {

	public static void main(String[] args) {

		char[][] numArr = {
				{'A', 'B', 'C', 'D', 'E'},
				{'a', 'b', 'c', 'd', 'e'},
				{'0', '1', '2', '3', '4'},
				{'F', 'G', 'H', 'I', 'J'},
				{'f', 'g', 'h', 'i', 'j'}
		};

		int max_row = Integer.MIN_VALUE;
		for(int i=0; i < numArr.length; i++) {
			if(numArr[i].length > max_row) {
				max_row = numArr[i].length;
			}
		}
		
		String printStr = "";
		for(int i = 0; i < max_row; i++ ) {
			for(int j=0; j < numArr.length; j++) {
				if(numArr[j].length < i +1) {
					break;
				}
				printStr += numArr[j][i];
			}
		}
		System.out.println(printStr);
		
		char[][] numArr2 = {
				{'A', 'A', 'B', 'C', 'D', 'D'},
				{'a', 'f', 'z', 'z'},
				{'0', '9', '1', '2', '1'}, 
				{'a', '8', 'E', 'W', 'g', '6'},
				{'P', '5', 'h', '3', 'k', 'x'}
		};

		max_row = Integer.MIN_VALUE;
		for(int i=0; i < numArr2.length; i++) {
			if(numArr2[i].length > max_row) {
				max_row = numArr2[i].length;
			}
		}
		
		printStr = "";
		
		for(int i = 0; i < max_row; i++ ) {
			for(int j=0; j < numArr2.length; j++) {
				if(numArr2[j].length < i+1) {
					continue;
				}
				printStr += numArr2[j][i];
			}
		}
		System.out.println(printStr);
		
	}

}
