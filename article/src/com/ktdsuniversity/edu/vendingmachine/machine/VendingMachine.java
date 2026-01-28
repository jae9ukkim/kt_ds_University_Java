package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.Item;

public class VendingMachine {

	private Item[] drinks;
	// 지불금액
	private int payment;

	public VendingMachine(Item bacas, Item monster, Item hotsix, Item milkiss) {
		this.drinks = new Item[4];
		this.drinks[0] = bacas;
		this.drinks[1] = monster;
		this.drinks[2] = hotsix;
		this.drinks[3] = milkiss;
	}

	public Item[] getDrinks() {
		return this.drinks;
	}

	public void setDrinks(Item[] drinks) {
		this.drinks = drinks;
	}

	public int getPayment() {
		return this.payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int order(int itemNo, int quantity, int payment) {

		this.payment = payment;

		if (itemNo < 0 || itemNo >= this.drinks.length) {
			System.out.println("존재하지 않는 음료입니다.");
			return 0;
		}

		Item drink = this.drinks[itemNo];

		if (drink.getStock() == 0) {
			System.out.println("음료가 품절되었습니다");
			return 0;
		}

		if (drink.getStock() < quantity) {
			System.out.println("음료가 부족합니다. " + drink.getStock() + "개 만큼 결제되었습니다.");
			quantity = drink.getStock();
		}

		int totalPrice = drink.getPrice() * quantity;

		if (payment < totalPrice) {
			quantity = payment / drink.getPrice();
			totalPrice = drink.getPrice() * quantity;
			System.out.println("요금이 부족합니다. " + quantity + "개 만큼 결제되었습니다.");
		}

		// 지불금액에서 결제금액 차감
		this.payment -= totalPrice;

//		this.drinks[itemNo].stock -= quantity;
		drink.setStock(drink.getStock() - quantity);

		return drink.getPrice() * quantity;
	}

	public void store(int itemNo, int quantity) {
		if (itemNo < 0 || itemNo >= this.drinks.length) {
			return;
		}

		Item drink = this.drinks[itemNo];

//		this.drinks[itemNo].stock += quantity;
		drink.setStock(drink.getStock() + quantity);

	}

	public void printStocks() {
		for (int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].getName() + " " + this.drinks[i].getStock() + "개 남았습니다.");
		}
	}
}
