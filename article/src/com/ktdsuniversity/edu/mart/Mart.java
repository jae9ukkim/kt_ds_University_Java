package com.ktdsuniversity.edu.mart;

/**
 * 일반마트
 * 1, 판매
 * 2. 거스름돈 돌려주는 기능
 */
public class Mart {

	// 상품
	private Item[] item;
	// 받은 금액
	private int receivedMoney;
	// 이익
	private int earning;

	public Mart(Item[] item) {
		this.item = item;
	}

	public Item[] getItem() {
		return this.item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}
	
	public int getReceivedMoney() {
		return this.receivedMoney;
	}

	public void setReceivedMoney(int receivedMoney) {
		this.receivedMoney = receivedMoney;
	}

	public int getEarning() {
		return this.earning;
	}

	public void setEarning(int earning) {
		this.earning = earning;
	}

	public void sell(Buyer buyer, int itemNo, int quantity, int paidAmount, int usePoint) {
		Item item = this.item[itemNo];
		this.receivedMoney = paidAmount;
		int priceToPay = item.getPrice() * quantity;

		// 판매할 수 있는지 확인
		if (isSellable(buyer, item, quantity)) {
			// 재고감소
			item.setStock(item.getStock() - quantity);
			// 계산
			if (this instanceof DepartmentStore ds) {
				// 할인 적용
				priceToPay = ds.applyPromotion(buyer, priceToPay);
			}
			if (this instanceof ConvenienceStore cs) {				
				// 포인트가 지불해야 할 금액보다 클 때
				if(usePoint > priceToPay) {
					priceToPay = 0;
				} else { // 포인트가 지불해야 할 금액보다 작을 때
					priceToPay -= usePoint;
				}
				buyer.setPoint(buyer.getPoint() - usePoint);
				// 포인트 지급
				cs.increPoint(buyer, item.getPrice() * quantity);
			}
			this.receivedMoney -= priceToPay;
			this.earning += priceToPay;
			System.out.println("매출액: " + this.earning);
		}
	}

	public boolean isSellable(Buyer buyer, Item item, int quantity) {
		// 재고가 남았는지
		int itemStock = item.getStock();
		if (itemStock == 0) {
			System.out.println("상품 재고가 없습니다.");
			return false;
		}
		else if (itemStock < quantity) {
			System.out.println("상품이 불충분합니다. 남은 수량 " + itemStock +"개 만큼 판매합니다.");
			return true;
		}
		return true;

	}
	
	public int refund() {
		System.out.println("거스름 돈: " + this.receivedMoney);
		return this.receivedMoney;
	}
	
	
}
