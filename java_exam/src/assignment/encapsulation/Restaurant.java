package assignment.encapsulation;

import javax.lang.model.element.QualifiedNameable;

public class Restaurant {

	private String name;
	private Menu[] food;
	private Menu[] alcohol;
	private int fullnessLimit;
	private double alcoholLimit;
	private int account;
	
	public Restaurant(String name, Menu[] food, Menu[] alcohol, int fullnessLimit, int alcoholLimit) {
		this.name = name;
		this.food = food;
		this.alcohol = alcohol;
		this.fullnessLimit = fullnessLimit;
		this.alcoholLimit = alcoholLimit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Menu[] getFood() {
		return food;
	}

	public void setFood(Menu[] food) {
		this.food = food;
	}

	public Menu[] getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(Menu[] alcohol) {
		this.alcohol = alcohol;
	}

	public int getFullnessLimit() {
		return fullnessLimit;
	}

	public void setFullnessLimit(int fullnessLimit) {
		this.fullnessLimit = fullnessLimit;
	}

	public double getAlcoholLimit() {
		return alcoholLimit;
	}

	public void setAlcoholLimit(double alcoholLimit) {
		this.alcoholLimit = alcoholLimit;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public void acceptFoodOrder(Customer customer, int foodNo, int quantity) {
		
		if(foodNo > this.food.length || foodNo < 0) {
			// 존재하지 않는 메뉴
			return;
		}
		Menu orderFood = this.food[foodNo];
		String orderMsg = "주문성공";		
		
		if(orderFood.getStock() < quantity) {
			// 재고가 부족하면 주문을 받지 않는다
			orderMsg = "주문실패 - 재고 부족";
		} else if(orderFood.getPrice() * quantity > customer.getMoney()) {
			// 소지금이 부족하면 주문을 받지 않는다
			orderMsg = "주문실패 - 소지금 부족";
		} else if(customer.getFullness() + orderFood.getSpec() * quantity > this.getFullnessLimit()) {
			// 고객의 배부름과 음식의 무게 합이 기준을 넘으면 주문을 받지 않는다
			orderMsg = "주문실패 - 과식";
		} else {
			// 음식 무게만큼 배부름 정도가 채워진다
			customer.setFullness(customer.getFullness() + (int)orderFood.getSpec() * quantity);
			// 가격만큼 손님 소지금 차감, 식당 자본금 증가
			customer.setMoney(customer.getMoney() - orderFood.getPrice() * quantity);
			this.setAccount(this.getAccount() + orderFood.getPrice() * quantity);
			// 음식 재고 감소
			orderFood.setStock(orderFood.getStock() - quantity); 
		}
		printOrderState(customer, orderFood, quantity, orderMsg);
	}

	public void acceptAlcoholOrder(Customer customer, int alcoholNo, int quantity) {

		if(alcoholNo > this.alcohol.length || alcoholNo < 0) {
			// 존재하지 않는 메뉴
			return;
		}
		Menu orderAlcohol = this.alcohol[alcoholNo];
		String orderMsg = "주문성공";
		 
		
		if(orderAlcohol.getStock() < quantity) {
			// 재고가 부족하면 주문을 받지 않는다
			orderMsg = "주문실패 - 재고 부족";
		} else if(customer.getAge() < 20) {
			// 미성년자
			orderMsg = "주문실패 - 미성년자";
		} else if(orderAlcohol.getPrice() * quantity > customer.getMoney()) {
			// 소지금이 부족하면 주문을 받지 않는다
			orderMsg = "주문실패 - 소지금 부족";
		} else if(customer.getDrunkenness() + orderAlcohol.getSpec() * quantity * 0.1 > this.alcoholLimit) {
			// 고객의 취기와 알콜 10%의 합이 기준을 넘으면 주문을 받지 않는다
			orderMsg = "주문실패 - 과음";
		} else {
			// 알콜 비율 10%만큼 취기 증가
			customer.setDrunkenness(customer.getDrunkenness() + orderAlcohol.getSpec() * quantity * 0.1);
			// 가격만큼 손님 소지금 차감, 식당 자본금 증가
			customer.setMoney(customer.getMoney() - orderAlcohol.getPrice() * quantity);
			this.setAccount(this.getAccount() + orderAlcohol.getPrice() * quantity);
			// 재고 감소
			orderAlcohol.setStock(orderAlcohol.getStock() - quantity);
		}
		printOrderState(customer, orderAlcohol, quantity, orderMsg);
	}

	public void printOrderState(Customer customer, Menu menu, int quantity, String msg) {
		System.out.println("고객명 : " + customer.getName());
		System.out.println(customer.getName() + "의 취함 정도 : " + customer.getDrunkenness());
		System.out.println(customer.getName() + "의 배부름 정도 : " + customer.getFullness());
		System.out.println(customer.getName() + "의 소지금 : " + customer.getMoney());
		System.out.println("주문메뉴 : " + menu.getName());
		System.out.println("주문수량 : " + quantity);
		System.out.println("주문금액 : " + menu.getPrice() * quantity);
		System.out.println(this.getName() + "식당의 배부름 기준 : " + this.getFullnessLimit());
		System.out.println(this.getName() + "식당의 취함 기준 : " + this.getAlcoholLimit());
		System.out.println(msg);
		System.out.println();
	}
	
	public void printRestaurantState() {
		System.out.println(this.getName() + "상태 확인");
		System.out.println("=========식사 메뉴=========");
		
		for(int i = 0; i < this.food.length; i++) {
			System.out.println(i+1 + ". " + this.food[i].getName() + " / " + this.food[i].getPrice() + " / " + this.food[i].getSpec() + "g / " + this.food[i].getStock() + "개");
		}
		System.out.println("=========주류 메뉴=========");
		for(int i = 0; i < this.alcohol.length; i++) {
			System.out.println(i+1 + ". " + this.alcohol[i].getName() + " / " + this.alcohol[i].getPrice() + " / " + this.alcohol[i].getSpec() + "% / " + this.alcohol[i].getStock() + "개");
		}
		System.out.println("매출금 : " + this.getAccount());
		System.out.println();
	}
}
