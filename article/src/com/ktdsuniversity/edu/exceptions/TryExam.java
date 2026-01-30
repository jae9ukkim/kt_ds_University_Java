package com.ktdsuniversity.edu.exceptions;

public class TryExam {

	public static void handledException() {
		try {
//			Class.forName("dsfs");
			Class.forName("package com.ktdsuniversity.edu.exceptions.TryExam");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}

	}

	public static void numberFormatExam(String str) {
		if (str != null) {
			int value = 0;
			try {
				value = Integer.parseInt("변환 전!");
				value = Integer.parseInt(str); // 예외 발생 가능성 높음!
				value = Integer.parseInt("변환 후!");
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
				nfe.printStackTrace();
			}
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		numberFormatExam("100000");
		numberFormatExam("sdflwkmelfsd");
		numberFormatExam("100000");

	}
}
