package assignment.encapsulation;

public class Customer {

	/**
	 * 이름
	 */
	String name;
	/**
	 * 나이
	 */
	int age;
	/**
	 * 소지금
	 */
	int money;
	/**
	 * 배부름
	 */
	private int fullness;
	/**
	 * 취함의 정도
	 */
	private double drunkenness;
	
	public Customer(String name, int age, int money, int fullness, double drunkenness) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.fullness = fullness;
		this.drunkenness = drunkenness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getFullness() {
		return fullness;
	}

	public void setFullness(int fullness) {
		this.fullness = fullness;
	}

	public double getDrunkenness() {
		return drunkenness;
	}

	public void setDrunkenness(double drunkenness) {
		this.drunkenness = drunkenness;
	}
	
	public void orderFoodFrom(Restaurant rest, int foodNo) {
		// 주문 전 배부름을 넘는지 확인
		int foodWeight = (int)rest.getFood()[foodNo].getSpec();
		if(foodWeight + this.fullness > rest.getFullnessLimit()) {
			System.out.println("과식하셨습니다");
			return;
		}		
		
		// 음식 무게만큼 배부름 정도가 채워짐
		this.fullness += foodWeight;
	}

	public void orderAlcoholFrom(Restaurant rest, int alcoholNo) {
		// 주문 전 취기를 넘는지 확인
		double alcoholRate = rest.getAlcohol()[alcoholNo].getSpec();
		if(alcoholRate / 10 + this.drunkenness > rest.getAlcoholLimit()) {
			System.out.println("과음하셨습니다");
			return;
		}
		
		// 알콜 비율의 10%만큼 취함 정도가 증가
		this.drunkenness += alcoholRate / 10;
	}
	
	
}
