package com.ktdsuniversity.edu.exceptions;

public class ExceptionExam {

	public static void nullExam(String str) {
		// str이 비어있지 않으면 출력
		if (str != null && !str.isEmpty()) {
			System.out.println(str);
		}
	}

	public static void arrayIndexExam(String[] arr, int index) {
		if (arr != null && index >= 0 && index < arr.length) {
			System.out.println(arr[index]);
		}
	}

	public static void numberFormatExam(String str) {

		if (str == null) { // null check
			System.out.println(0);
			return;
		}
		str = str.replace("_", "");
		// 11자리, 22억 등 잘못 된 값 ==> 0으로 치환
		if (str.matches("^[0-9]+${1,10}")) { // 정수타입이 아닌 경우 걸러냄 + 100억 이상 걸러냄.
			// {1,10} 한자리 이상 10자리 미만

			long tempNum = Long.parseLong(str);
			if (tempNum > Integer.MAX_VALUE) {
				tempNum = 0;
			}

			// 숫자를 정수로 변경
			int num = (int) tempNum;
			System.out.println(num);
		} else {
			System.out.println(0);
		}

//		if (str.length() > 10) {
//			System.out.println("범위를 벗어났습니다.");
//		}

	}

	public static void main(String[] args) {
//		nullExam("asdfg");
//		nullExam("    ");
//		nullExam("");
//		nullExam("123dfs");
//		nullExam(null);

//		arrayIndexExam(new String[] { "a", "b" }, 0);
//		arrayIndexExam(new String[] { "a", "b" }, 1);
//		arrayIndexExam(new String[] { "a", "b" }, 2);
//		arrayIndexExam(new String[] { "a", "b" }, -1);
//		arrayIndexExam(null, -1);
//		arrayIndexExam(null, 0);

		numberFormatExam("10");
		numberFormatExam("2000");
		numberFormatExam("3_000_000");
		numberFormatExam("3000000000");
		numberFormatExam("3.141592");
		numberFormatExam("wejjgow");
		numberFormatExam(null);
	}

}
