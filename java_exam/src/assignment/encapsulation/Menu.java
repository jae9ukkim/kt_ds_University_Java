package assignment.encapsulation;

public class Menu {
		
	/** 
	 * 메뉴명
	 */
	String name;
	/**
	 * 가격
	 */
	int price;
	/**
	 * 무게 또는 알콜도수 
	 */
	double spec;
	/**
	 * 재고
	 */
	int stock;
	
	public Menu(String name, int price, int spec, int stock) {
		this.name = name;
		this.price = price;
		this.spec = spec;		
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getSpec() {
		return spec;
	}

	public void setSpec(double spec) {
		this.spec = spec;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
