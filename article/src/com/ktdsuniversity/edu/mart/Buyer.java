package com.ktdsuniversity.edu.mart;

public class Buyer {

	// 소지금
	private int wallet;
	// 포인트
	private int point;

	public Buyer(int wallet) {
		this(wallet, 0);
	}
	
	public Buyer(int wallet, int point) {
		this.wallet = wallet;
		this.point = point;
	}

	public int getWallet() {
		return this.wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	/**
	 * 
	 * @param mart 판매점
	 * @param itemNo 상품번호
	 * @param quantity 구매수량
	 * @param paidAmount 지불금액
	 */
	public void buy(Mart mart, int itemNo, int quantity, int paidAmount) {

		Item item = mart.getItem()[itemNo];
		int priceToPay = item.getPrice() * quantity;
		int usePoint = 0;
		
		if (mart instanceof DepartmentStore) {
			if(this.point > 10000) {
				usePoint = (int)( Math.random() * (this.point+1) );
			}
		} else if(mart instanceof ConvenienceStore) {
			if(this.point > 100) {
				usePoint = this.point;
			}
		}

		// 구매할 수 있는지 확인
		if (isBuyable(mart, priceToPay, paidAmount, usePoint)) {
			// 지불
			this.wallet -= paidAmount;			
			mart.sell(this, itemNo, quantity, paidAmount, usePoint);

			// 거스름돈 돌려받음
			this.wallet += mart.refund();

		}

	}

	public boolean isBuyable(Mart mart, int price, int paidAmount, int usePoint) {
		
		if (mart instanceof DepartmentStore ds) {
			// 할인 금액 확인
			price = ds.applyPromotion(this, price);		
		}		
		if (mart instanceof ConvenienceStore) {
			if (usePoint + paidAmount < price) {
				System.out.println("지불한 돈이 부족합니다. 구매가격: " + price + ", 손님이 지불한 돈: "+ paidAmount);
				return false;
			}
		}
		// 지불금액 확인
		else if (paidAmount < price) {
			System.out.println("지불한 돈이 부족합니다. 구매가격: " + price + ", 손님이 지불한 돈: "+ paidAmount);
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "구매자의 남은 돈: " + wallet + ", 남은 포인트: " + point;
	}
	
	
}
