package assignment;

public class Seller {
	// 상품금액
	final int itemPrice = 1000;
	// 재고
	int stock;
	// 자본금
	int capital;
	
	public void sell(int amount) {
		if(amount > stock) {
			amount = stock;
		}
		stock -= amount;
		capital += amount * itemPrice;
		if(stock == 0) {
			System.out.println("품절되었습니다");
		}
		System.out.println("재고 수 : " + stock + ", 자본금 : " + capital);
	}
}
