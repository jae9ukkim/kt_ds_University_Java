package com.ktdsuniversity.edu.mart;

public class MartTest {

	public static void main(String[] args) {

		Item[] item = new Item[5];
		item[0] = new Item("상품1", 1_500, 20);
		item[1] = new Item("상품2", 10_000, 33);
		item[2] = new Item("상품3", 10_000, 70);
		item[3] = new Item("상품4", 99_000, 61);
		item[4] = new Item("상품5", 128_000, 5);

		Buyer buyer1 = new Buyer(200_000);
		Buyer buyer2 = new VIP(7_000, 300);
		Buyer buyer3 = new VVIP(0, 12000);
		
		Mart mart = new Mart(item);
		Mart cs = new ConvenienceStore(item);
		Mart ds = new DepartmentStore(item);
		
//		buyer1.buy(mart, 0, 5, 10000);
//		buyer2.buy(mart, 0, 5, 7000);
//		buyer3.buy(mart, 0, 5, 0);

//		buyer1.buy(cs, 0, 5, 10000);
//		buyer2.buy(cs, 0, 5, 7000);
//		buyer3.buy(cs, 0, 5, 0);

		buyer1.buy(ds, 0, 5, 10000);
		buyer2.buy(ds, 0, 5, 7000);
		buyer3.buy(ds, 0, 5, 0);

		System.out.println(buyer1);
		System.out.println(buyer2);
		System.out.println(buyer3);

	}
}
