package com.ktdsuniversity.edu.abstracts;

/**
 * 상속한 클래스가 추상 클래스이고 추상 메소드가 존재할 경우
 * 추상 메소드를 구현하지 않으면 에러 발생.
 * 
 * 해결 방법
 *    1. 추상 메소드를 서브 클래스에서 구현. --> 추상 메소드를 Override.
 *    2. 서브 클래스를 추상 클래스로 변환. --> 인스턴스 생성 불가(구현되지 않은 메소드가 존재하기 때문).
 */
public class Mart extends AbstractMart {

	public Mart(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {

	}

	@Override
	public int discount(Guest guest, int amount) {
		return 0;
	}
}
