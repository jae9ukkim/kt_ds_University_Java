package oop;

import java.util.concurrent.ArrayBlockingQueue;

public class Kiosk {

//	String menu;
//	int price;
//	String order;
//	int orderCnt;
	Item[] menu;
	int orderSum;
	Item[] order;

	/**
	 * 키오스크의 메뉴와 가격 초기설정
	 */
//	public Kiosk(String menu, int price) {
//		this.menu = menu;
//		this.price = price;
//	}	
	public Kiosk(Item menu1, Item menu2, Item menu3, Item menu4, Item menu5) {
		this.menu = new Item[5];
		this.menu[0] = menu1;
		this.menu[1] = menu2;
		this.menu[2] = menu3;
		this.menu[3] = menu4;
		this.menu[4] = menu5;
	}	
	/**
	 * 메뉴 보여주기
	 */
	public void showMenu() {		
		for(int i = 0; i< this.menu.length; i++) {
			System.out.print("메뉴명 : " + this.menu[i].name);
			System.out.println(", 가격 : " + this.menu[i].price);
		}

	}
	/**
	 * 주문목록에 추가
	 */
//	public void addOrder() {
//		if(order == null) {
//			order = menu;
//		}
//		orderCnt++;
//		orderSum += price;
//		showOrder();
//	}
	public void addOrder(int menuNo) {
		if(order == null) {
			order = this.menu.clone();
		}
		order[menuNo].stock++;		
		orderSum += order[menuNo].price;
		showOrder();
	}
	/**
	 * 주문수량 증가
	 */
//	public void increOrder() {
//		if(order == null) {
//			return;
//		}			
//		orderCnt++;
//		orderSum += price;
//		showOrder();
//	}
	public void increOrder(int menuNo, int orderCnt) {
		if(this.menu[menuNo].stock == 0) {
			return;
		}			
		this.menu[menuNo].stock += orderCnt;
		orderSum += this.menu[menuNo].price * orderCnt;
		showOrder();
	}
	/**
	 * 주문수량 감소
	 */
//	public void decreOrder() {
//		if(order == null) {
//			return;
//		}			
//		orderCnt--;
//		orderSum -= price;
//		if(orderCnt <= 0) {
//			order = null;
//			orderCnt = 0;
//			orderSum = 0;
//		}
//		showOrder();
//	}
	public void decreOrder(int menuNo, int orderCnt) {
		Item orderMenu = this.menu[menuNo];
		if(orderMenu.stock == 0) {
			return;
		}			
		if(orderMenu.stock < orderCnt) {
			orderCnt = orderMenu.stock; 
		}
		
		orderMenu.stock -= orderCnt;
		orderSum -= orderMenu.price * orderCnt;
		
		if(orderSum == 0) {
			order = null;
		}
		showOrder();
	}
	
	public void showOrder() {
		if(orderSum == 0) {
			return;
		}
		for(int i = 0; i < this.order.length; i++) {
			if(order[i].stock > 0) {
				System.out.print("주문메뉴 : " + order[i].name);
				System.out.print(", 주문수량 : " + order[i].stock);
				System.out.println(", 금액 : " + order[i].stock * order[i].price);
			}
		}
		System.out.println("총 금액 : " + orderSum);
			
	}
	
	/**
	 * 결제
	 */
//	public void pay() {
//		if(orderSum == 0) {
//			return;
//		}
//		System.out.println(order + " " + orderCnt + "개 총 " + orderSum + " 결제되었습니다.");
//		order = null;
//		orderCnt = 0;
//		orderSum = 0;		
//	}
	public void pay() {
		if(orderSum == 0) {
			return;
		}
		showOrder();
		System.out.println("결제되었습니다.");
		order = null;
		orderSum = 0;		
	}
}
