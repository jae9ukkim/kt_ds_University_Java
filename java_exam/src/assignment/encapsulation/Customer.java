package assignment.encapsulation;

public class Customer {

	/**
	 * 배부름
	 */
	private int fullness;
	/**
	 * 취함의 정도
	 */
	private double drunkenRate;
	
	public Customer(int fullness, double drunkenRate) {
		this.fullness = fullness;
		this.drunkenRate = drunkenRate;
	}

	public int getFullness() {
		return fullness;
	}

	public void setFullness(int fullness) {
		this.fullness = fullness;
	}

	public double getDrunkenRate() {
		return drunkenRate;
	}

	public void setDrunkenRate(double drunkenRate) {
		this.drunkenRate = drunkenRate;
	}
	
	public void orderFoodFrom(Restaurant rest, int foodNo) {
		// 주문 전 배부름을 넘는지 확인
		int foodWeight = rest.getFood()[foodNo].getFeature();
		if(foodWeight + this.fullness > rest.getFullnessLine()) {
			System.out.println("과식하셨습니다");
			return;
		}		
		
		// 음식 무게만큼 배부름 정도가 채워짐
		this.fullness += foodWeight;
	}

	public void orderAlcoholFrom(Restaurant rest, int alcoholNo) {
		// 주문 전 취기를 넘는지 확인
		double alcoholRate = rest.getAlcohol()[alcoholNo].getFeature();
		if(alcoholRate / 10 + this.drunkenRate > rest.getDrunkenRateLine()) {
			System.out.println("과음하셨습니다");
			return;
		}
		
		// 알콜 비율의 10%만큼 취함 정도가 증가
		this.drunkenRate += alcoholRate / 10;
	}
	
	
}
