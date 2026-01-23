package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.Item;

public class VendingMachine {

	private Item[] drinks;
	
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
	
	public int order(int itemNo, int quantity) {
		if(itemNo <0 || itemNo >= this.drinks.length) {
			return 0;
		}		
		
		Item drink = this.drinks[itemNo];
		
		if(drink.getStock() == 0) {
			System.out.println("상품이 품절되었습니다");
			return 0;
		}

		if(drink.getStock() < quantity) {
			quantity = drink.getStock();
		}

//		this.drinks[itemNo].stock -= quantity;
		drink.setStock(drink.getStock() - quantity);
		
		
		return drink.getPrice() * quantity;
	}
	
	public void store(int itemNo, int quantity) {
		if(itemNo <0 || itemNo >= this.drinks.length) {
			return;
		}
		
		Item drink = this.drinks[itemNo];
		
//		this.drinks[itemNo].stock += quantity;
		drink.setStock(drink.getStock() + quantity);
				
	}
	
	public void printStocks() {
		for(int i=0; i< this.drinks.length; i++) {
			System.out.println(this.drinks[i].getName() + " " + this.drinks[i].getStock() + "개 남았습니다.");
		}
	}
}
