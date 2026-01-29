package com.ktdsuniversity.edu.mart;

public class Buyer {

	// 소지금
	private int wallet;
	// 등급?
	private String grade;
	// 포인트
	private int point;

	public Buyer(int wallet, String grade) {
		this.wallet = wallet;
		this.grade = grade;
	}

	public int getWallet() {
		return this.wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void buy(Mart mart, int itemNo, int quantity) {
		this.buy(mart, itemNo, quantity, 0);
	}

	public void buy(Mart mart, int itemNo, int quantity, int usePoint) {

		Item item = mart.getItem()[itemNo];
		int priceToPay = item.getPrice() * quantity;

		// 구매할 수 있는지 확인
		if (isBuyable(mart, item, quantity)) {
			mart.sell(this, itemNo, quantity);
			if (mart instanceof DepartmentStore ds) {

			}
			// 편의점이고 포인트가 100 이상일 경우 포인트먼저 차감
			if (mart instanceof ConvenienceStore cs && this.point >= 100) {
				// 할인혜택? 선...적용? apply Benefits or Promotions
				// 포인트 먼저 차감. ConvenienceStore Class에서 하기?

				priceToPay = cs.applyPromotion(this, priceToPay);

				// 포인트 지급. 전체금액에 비율만큼 추가
				cs.increPoint(this, item.getPrice() * quantity);
			}
			// 소지금 감소
			this.wallet -= priceToPay;
			// 거스름돈 돌려줌
		}

	}

	public boolean isBuyable(Mart mart, Item item, int quantity) {

		// 편의점의 경우 포인트가 100 이상일 경우 포인트도 고려
		if (mart instanceof ConvenienceStore cs) {
			if (this.point >= 100 && this.point + this.wallet < item.getPrice() * quantity) {
				System.out.println("소지금이 부족합니다.");
				return false;
			}
		}
		// 소지금 확인
		else if (this.wallet < item.getPrice() * quantity) {
			System.out.println("소지금이 부족합니다.");
			return false;
		}
		return true;
	}
}
