package com.ktdsuniversity.edu.array;

public class Q181867 {

	public static void main(String[] args) {

		String myString = "oxooxoxxox";
		// string이 x로 끝나면 뒤에 띄어쓰기를 추가하면 정상적으로 나온다
		if(myString.endsWith("x")) {
			myString += " ";
		}
		
		String[]splitted = myString.split("x");
		for(int i = 0; i < splitted.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
//			System.out.print(splitted[i].length());
			// 띄어쓰기 길이 포함되면 안되기에 trim() 사용
			System.out.print(splitted[i].trim().length());			
		}
		System.out.println();
		
		myString = "xabcxdefxghi"	;
		splitted = myString.split("x");
		for(int i = 0; i< splitted.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(splitted[i].length());			
		}
	}

}
