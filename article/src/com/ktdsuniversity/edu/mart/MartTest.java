package com.ktdsuniversity.edu.mart;

public class MartTest {

	public static void main(String[] args) {

		Buyer buyer = new Buyer(100_000, "일반");

		Item[] item = new Item[5];
		item[0] = new Item("상품1", 1_500, 20);
		item[1] = new Item("상품2", 10_000, 33);
		item[2] = new Item("상품3", 10_000, 70);
		item[3] = new Item("상품4", 99_000, 61);
		item[4] = new Item("상품5", 128_000, 5);

		Mart mart = new Mart(item);

		buyer.buy(mart, 0, 10);

	}
}
