package assignment;

public class Buyer {	
	final int itemPrice = 1000;
	final int itemWeight = 500;
	int itemCnt;
	int cash;
	int maxWeight;
	int cartWeight;
	
	public Buyer(int cash, int maxWeight) {
		this.cash = cash;
		this.maxWeight = maxWeight;
	}
		
	public void buy(int amount) {
		if(amount * 500 + cartWeight > maxWeight) {
			System.out.println("더 이상 장바구니를 들 수 없습니다");
		}
		else if(amount * itemPrice > cash) {
			System.out.println("돈이 부족합니다");
		}
		else {
			itemCnt += amount;
			cash -= amount * itemPrice;
			cartWeight += amount * itemWeight;
		}
		System.out.print("구매자의 상품 수 : " + itemCnt);
		System.out.print(", 장바구니의 무게 : " + cartWeight);
		System.out.println(", 지갑의 돈 : " + cash);
	}
	
}
