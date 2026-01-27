package com.ktdsuniversity.edu.array;

public class Q181869 {

	public static void main(String[] args) {

		String my_string = "i love you";
		String[] result = my_string.split(" ");
					
		for(int i = 0; i < result.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			if(!result[i].equals("")) {
				System.out.print(result[i]);				
			}
		}
		System.out.println();
		
		my_string = "programmers";
		result = my_string.split(" ");
		
		
		for(int i = 0; i < result.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			if(!result[i].equals("")) {
				System.out.print(result[i]);				
			}
		}
		System.out.println();
	}
	

}
