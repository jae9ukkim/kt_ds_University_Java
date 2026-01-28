package com.ktdsuniversity.edu.mart;

public class Mart {

	// 상품
	Item[] item;
	// 지불금액

	public Mart(Item[] item) {
		this.item = item;
	}

	public Item[] getItem() {
		return this.item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	public void sell(Buyer buyer, int itemNo, int quantity) {
		Item item = this.item[itemNo];

		// 판매할 수 있는지 확인
		if (isSellable(buyer, item, quantity)) {
			// 재고감소
			item.setStock(item.getStock() - quantity);
		}
	}

	public boolean isSellable(Buyer buyer, Item item, int quantity) {
		// 재고가 남았는지
		if (item.getStock() < quantity) {
			System.out.println("상품이 불충분합니다.");
			return false;
		}
		return true;

	}
}
