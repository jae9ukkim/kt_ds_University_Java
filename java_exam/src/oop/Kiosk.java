package oop;

public class Kiosk {

	String menu;
	int price;
	String order;
	int orderCnt;
	int orderSum;

	/**
	 * 키오스크의 메뉴와 가격 초기설정
	 */
	public Kiosk(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}	
	/**
	 * 메뉴 보여주기
	 */
	public void showMenu() {		
		System.out.println("메뉴명 : " + menu);
		System.out.println("가격 : " + price);

	}
	/**
	 * 주문목록에 추가
	 */
	public void addOrder() {
		if(order == null) {
			order = menu;
		}
		orderCnt++;
		orderSum += price;
		showOrder();
	}
	/**
	 * 주문수량 증가
	 */
	public void increOrder() {
		if(order == null) {
			return;
		}			
		orderCnt++;
		orderSum += price;
		showOrder();
	}
	/**
	 * 주문수량 감소
	 */
	public void decreOrder() {
		if(order == null) {
			return;
		}			
		orderCnt--;
		orderSum -= price;
		if(orderCnt <= 0) {
			order = null;
			orderCnt = 0;
			orderSum = 0;
		}
		showOrder();
	}
	
	public void showOrder() {
		System.out.println("주문메뉴 : " + order);
		System.out.println("결제금액 : " + orderSum);
	}
	
	/**
	 * 결제
	 */
	public void pay() {
		if(orderSum == 0) {
			return;
		}
		System.out.println(order + " " + orderCnt + "개 총 " + orderSum + " 결제되었습니다.");
		order = null;
		orderCnt = 0;
		orderSum = 0;		
	}
}
