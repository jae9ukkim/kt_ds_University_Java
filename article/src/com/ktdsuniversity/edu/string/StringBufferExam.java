package com.ktdsuniversity.edu.string;

public class StringBufferExam {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");
		sb.append("bnniofjeoigjidofd");

		String str = sb.toString();
		System.out.println(sb);
		System.out.println(str);

		StringBuffer longString = new StringBuffer();

		for (int i = 0; i < 1000000; i++) {
			longString.append("oadfergoiejoiw");
		}
		String resultString = longString.toString();
		System.out.println(">>" + resultString);
	}

}
