package com.ktdsuniversity.edu.abstracts;

/**
 * public class Name : 인스턴스로 생성할 수 있는 일반 클래스 정의 
 * public abstract class Name : 인스턴스로 생성할 수 없는 추상 클래스 정의
 */
public abstract class AbstractMart {

	/** 금고	 */
	private int safe;
	private int productPrice;
	/** 거스름돈 */
	private int remainMoney;

	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;
	}

	public void sell(Guest guest, int sellCount, int money) {
		this.remainMoney = money;

		int guestPoint = this.usePoint(guest);

		// 판매가격
		int amount = sellCount * this.productPrice;
		// 할인. 할인금액만큼 차감
		amount -= this.discount(guest, amount);

		if (money + guestPoint < amount) {
			System.out.println("돈이 모자랍니다. 구매가격: " + amount + ", 손님이 낸 돈: " + money);
			return;
		}

		// 손님이 마트에 돈을 지불.
		guest.pay(money);

		this.givePoint(guest, amount);

		if (amount > guestPoint) { // 포인트가 부족한 경우 돈으로 나머지 지불
			this.remainMoney -= (amount - guestPoint);
		}
		// 지불금액 - 남은금액 = 실제로 지불한 금액 = 매출액
		this.safe += money - this.remainMoney;
		System.out.println("매출액: " + this.safe);
		System.out.println("거슬러 줄 돈: " + this.remainMoney);
		// 마트가 손님에게 거슬러 준다.
		guest.giveMoney(this.remainMoney);
		this.remainMoney = 0;
	}

	public abstract int usePoint(Guest guest);

	public abstract void givePoint(Guest guest, int amount);

	public abstract int discount(Guest guest, int amount);
}
