package oop;

public class KioskTest {

	public static void main(String[] args) {
		
		Kiosk kiosk = new Kiosk("americano", 4500);
		
		kiosk.showMenu();
		kiosk.addOrder();
		
		kiosk.increOrder();
		kiosk.increOrder();
		kiosk.increOrder();
		kiosk.increOrder();
		kiosk.increOrder();
		
		kiosk.decreOrder();
		kiosk.decreOrder();
//		kiosk.decreOrder();
//		kiosk.decreOrder();
//		kiosk.decreOrder();
		
		kiosk.showOrder();
		
		kiosk.pay();
		
	}
}
