package com.ktdsuniversity.edu.member.management;

public class Member {

	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printInfo() { // 멤버변수를 보호하는 일반적인 방법
		System.out.println("작성자ID: " + this.id);
		System.out.println("작성자명: " + this.name);
	}
	
}
