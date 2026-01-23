package com.ktdsuniversity.edu.coffee;

public class CoffeeShopTest {

	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노(Hot)", 4500, 100);
		Coffee iceCoffee = new Coffee("아이스티", 4000, 60);
//		Coffee tea = new Coffee("캐모마일티", 5000);

		CoffeeShop starbucks = new CoffeeShop(hotCoffee,iceCoffee);
//		CoffeeShopArray starbucks = new CoffeeShopArray(hotCoffee,iceCoffee,tea);
		
		int price = starbucks.orderCoffee(1, 3);
		System.out.println(price);
		price = starbucks.orderCoffee(1, 50);
		System.out.println(price);
		price = starbucks.orderCoffee(1, 40);
		System.out.println(price);
	
		price = starbucks.orderCoffee(2, 10);
		System.out.println(price);
		price = starbucks.orderCoffee(2, 60);
		System.out.println(price);
		price = starbucks.orderCoffee(2, 50);
		System.out.println(price);
		price = starbucks.orderCoffee(2, 1);
		System.out.println(price);
		
//		price = starbucks.orderCoffee(2, 6);
//		System.out.println(price);
//
//		price = starbucks.orderCoffee(3, 5);
//		System.out.println(price);
//
//		price = starbucks.orderCoffee(0, 10);
//		System.out.println(price);
		
		
		
	}
}
