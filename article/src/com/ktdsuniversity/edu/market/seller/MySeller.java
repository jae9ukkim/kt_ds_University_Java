package com.ktdsuniversity.edu.market.seller;

public class MySeller {
	// 상품금액
	private final int ITEM_PRICE = 1000;
	private final int ITEM_WEIGHT = 500;
	// 재고
	private int stock;
	// 자본금
	private int capital;
	
//	public Seller(int stock, int capital) {
//		this.stock = stock;
//		this.capital = capital;
//	}
	public MySeller(int stock) {
		this.stock = stock;
	}
	
	public int getITEM_PRICE() {
		return this.ITEM_PRICE;
	}
		
	public int getITEM_WEIGHT() {
		return this.ITEM_WEIGHT;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getCapital() {
		return this.capital;
	}
	
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	public void sell(int amount) {
		if(amount > this.stock) {
			amount = this.stock;
		}
		this.stock -= amount;
		this.capital += amount * this.ITEM_PRICE;
		if(this.stock == 0) {
			System.out.println("품절되었습니다");
		}
		System.out.println("재고 수 : " + this.stock + ", 자본금 : " + this.capital);
	}
}
