package assignment.encapsulation;

public class Restaurant {

	private Menu[] food;
	private Menu[] alcohol;
	private int fullnessLine;
	private int drunkenRateLine;
	
	public Restaurant(Menu[] food, Menu[] alcohol, int fullnessLine, int drunkenRateLine) {
		this.food = food;
		this.alcohol = alcohol;
		this.fullnessLine = fullnessLine;
		this.drunkenRateLine = drunkenRateLine;
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

	public int getFullnessLine() {
		return fullnessLine;
	}

	public void setFullnessLine(int fullnessLine) {
		this.fullnessLine = fullnessLine;
	}

	public int getDrunkenRateLine() {
		return drunkenRateLine;
	}

	public void setDrunkenRateLine(int drunkenRateLine) {
		this.drunkenRateLine = drunkenRateLine;
	}
	
	
}
