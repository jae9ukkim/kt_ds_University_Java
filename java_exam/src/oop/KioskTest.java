package oop;

public class KioskTest {

	public static void main(String[] args) {
		
//		Kiosk kiosk = new Kiosk("americano", 4500);
		Item koreanFood1 = new Item("김치찌개", 7500, 85);
		Item koreanFood2 = new Item("볶음밥", 6000, 75);
		Item koreanFood3 = new Item("닭갈비", 12000, 200);
		Item koreanFood4 = new Item("냉면", 11000, 100);
		Item koreanFood5 = new Item("순대국밥", 8000, 150);
		Kiosk kiosk = new Kiosk(koreanFood1, koreanFood2, koreanFood3, koreanFood4, koreanFood5);
		
//		kiosk.showMenu();
//		kiosk.addOrder();
//		
//		kiosk.increOrder();
//		kiosk.increOrder();
//		kiosk.increOrder();
//		kiosk.increOrder();
//		kiosk.increOrder();
//		
//		kiosk.decreOrder();
//		kiosk.decreOrder();
////		kiosk.decreOrder();
////		kiosk.decreOrder();
////		kiosk.decreOrder();
		kiosk.showMenu();
		kiosk.addOrder(0);
		kiosk.addOrder(2);
		kiosk.addOrder(4);
		
		kiosk.increOrder(0, 1);		
		kiosk.increOrder(1, 2);		
		kiosk.increOrder(2, 5);		
		kiosk.increOrder(4, 9);		
		kiosk.decreOrder(4,5);
		
		kiosk.showOrder();
		
		kiosk.pay();
		
	}
}
