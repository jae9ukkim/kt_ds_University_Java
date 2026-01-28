package oop;

public class VendingMachine {

	Item[] drinks;

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

	public int order(int itemNo, int quantity) {
		if (itemNo < 0 || itemNo >= this.drinks.length) {
			return 0;
		}
		if (this.drinks[itemNo].stock == 0) {
			System.out.println("상품이 품절되었습니다");
			return 0;
		}

		if (this.drinks[itemNo].stock < quantity) {
			quantity = this.drinks[itemNo].stock;
		}

		this.drinks[itemNo].stock -= quantity;

		return this.drinks[itemNo].price * quantity;
	}

	public void store(int itemNo, int quantity) {
		if (itemNo < 0 || itemNo >= this.drinks.length) {
			return;
		}

		this.drinks[itemNo].stock += quantity;

	}

	public void printStocks() {
		for (int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].name + " " + this.drinks[i].stock + "개 남았습니다.");
		}
	}
}
