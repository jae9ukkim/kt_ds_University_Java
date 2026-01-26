package com.ktdsuniversity.edu.coffee;

public class CoffeeShop {

	/**
	 * 커피숍에서 판매하는 차가운 아메리카노
	 */
	private Coffee ice;
	/**
	 * 커피숍에서 판매하는 따뜻한 아메리카노
	 */
	private Coffee hot;
	
	public CoffeeShop() { // 생성자 오버로딩
//		this.hot = new Coffee("기본 아메리카노", 1500, 30);
//		this.ice = new Coffee("아이스 아메리카노", 1500, 50);
		this(new Coffee("기본 아메리카노", 1500, 30)
			, new Coffee("아이스 아메리카노", 1500, 50)); // 생성자 호출
	}
	
	public CoffeeShop(Coffee hot, Coffee ice) {
		this.hot = hot;
		this.ice = ice;
	}
	
	public Coffee getIce() {
		return this.ice;
	}
	
	public void setIce(Coffee ice) {
		this.ice = ice;
	}
	
	public Coffee getHot() {
		return this.hot;
	}
	
	public void setHot(Coffee hot) {
		this.hot = hot;
	}
	
	/**
	 * 가장 첫 번쨰 메뉴를 한 개만 주문한다.
	 */
	public int orderCoffee() { 
		int price = this.orderCoffee(1);
		return price;
	}
	/**
	 * 메뉴 한 개만 주문한다.
	 */
	public int orderCoffee(int menu) { // 가장 쉽고 보편적인 오버로딩 방법
		int price = this.orderCoffee(menu, 1);
		return price;
	}
	
	/**
	 * 커피숍에서 커피를 판매한다
	 * @param menu 메뉴들의 번호. 1:hot, 2:ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	public int orderCoffee(int menu, int quantity) {
		// TODO 주문한 음료의 재고가 quantity 보다 모자라면 판매하지 않는다.
		// TODO 음료를 판매하면 재고가 quantity 만큼 감소한다.
		if(menu == 1) {
			if(this.hot.getStock() >= quantity) {
				System.out.println(this.hot.getName() + " 음료를 " + quantity + "개 주문 받았습니다.");
				this.hot.setStock(this.hot.getStock() - quantity);
				return this.hot.getPrice() * quantity;
			}
			return 0;
		}
		else if(menu == 2) {
			if(this.ice.getStock() >= quantity) {
				System.out.println(this.ice.getName() + " 음료를 " + quantity + "개 주문 받았습니다.");
				this.ice.setStock(this.ice.getStock() - quantity);
				return this.ice.getPrice() * quantity;
			}
			return 0;
		}
		System.out.println("존재하지 않는 음료 입니다.");
		return 0;
	}
}
