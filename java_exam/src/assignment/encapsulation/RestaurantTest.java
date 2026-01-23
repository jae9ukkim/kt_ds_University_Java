package assignment.encapsulation;

public class RestaurantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu[] food = new Menu[8]; 
		food[0] = new Menu("짜장면", 300);
		food[1] = new Menu("짬뽕", 500);
		food[2] = new Menu("탕수육", 800);
		Menu[] alcohol = new Menu[8]; 
		alcohol[0] = new Menu("소주", 20);
		alcohol[1] = new Menu("맥주", 10);
		
		Restaurant chineseRest = new Restaurant(food, alcohol, 98, 87);
		Customer drunkenTiger = new Customer(20, 80);
		
		drunkenTiger.orderFoodFrom(chineseRest, 0);
		System.out.println("배부름: " + drunkenTiger.getFullness());
		System.out.println("취기: " + drunkenTiger.getDrunkenRate());

		drunkenTiger.orderAlcoholFrom(chineseRest, 0);
		System.out.println("배부름: " + drunkenTiger.getFullness());
		System.out.println("취기: " + drunkenTiger.getDrunkenRate());
		
		
	}

}
