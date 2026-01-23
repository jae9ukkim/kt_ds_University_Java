package com.ktdsuniversity.edu.market.buyer;

public class MyBuyer {	
	
	private int itemCnt;
	private int cash;
	private int maxWeight;
	private int cartWeight;
	
	public MyBuyer(int cash, int maxWeight) {
		this.cash = cash;
		this.maxWeight = maxWeight;
	}
	
	public int getItemCnt() {
		return this.itemCnt;
	}
	
	public void setItemCnt(int itemCnt) {
		this.itemCnt = itemCnt;
	}
	
	public int getCash() {
		return this.cash;
	}
	
	public void setCash(int cash) {
		this.cash = cash;
	}
	
	public int getMaxWeight() {
		return this.maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	public int getCartWeight() {
		return this.cartWeight;
	}
	
	public void setCartWeight(int cartWeight) {
		this.cartWeight = cartWeight;
	}
	
	public void buy(int money, int weight, int productCount) {
		if(weight > this.maxWeight) {
			System.out.println("더 이상 장바구니를 들 수 없습니다");
		}
		else if(money > this.cash) {
			System.out.println("돈이 부족합니다");
		}
		else {
			this.itemCnt += productCount;
			this.cash -= money;
			this.cartWeight += weight;
		}
		System.out.print("구매자의 상품 수 : " + this.itemCnt);
		System.out.print(", 장바구니의 무게 : " + this.cartWeight);
		System.out.println(", 지갑의 돈 : " + this.cash);
	}
	
}
