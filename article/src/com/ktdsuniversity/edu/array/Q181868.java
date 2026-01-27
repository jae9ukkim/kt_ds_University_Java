package com.ktdsuniversity.edu.array;

public class Q181868 {

	public static void main(String[] args) {

		String my_string = " i    love  you";
		my_string = my_string.trim();
		String[] result;
		int idx = 0;
		
		// 좌우 공백 제거 trim()
		// 중복 공백 문자가 사라질때까지 replace. while()과 contains 사용 - 생각보다 많이 쓰인다.
//		while(my_string.contains("  ")) {
//			my_string.replace("  ", " ");
//		}
		
		while(true) {
			idx = my_string.indexOf(" ", idx);
			if(idx == -1) {
				break;
			}
			my_string = my_string.substring(0, idx+1) + my_string.substring(idx).trim();
			idx++;
		}
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
		
		my_string = "    programmers  ";
		my_string = my_string.trim();
		idx = 0;
		
		while(true) {
			idx = my_string.indexOf(" ", idx);
			if(idx == -1) {
				break;
			}
			my_string = my_string.substring(0, idx+1) + my_string.substring(idx).trim();
			idx++;
		}
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
