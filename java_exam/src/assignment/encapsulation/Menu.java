package assignment.encapsulation;

public class Menu {
		
	String name;
	/**
	 * 무게 또는 알콜도수 
	 */
	int feature;
	
	public Menu(String name, int feature) {
		this.name = name;
		this.feature = feature;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFeature() {
		return feature;
	}

	public void setFeature(int feature) {
		this.feature = feature;
	}
	
	
}
