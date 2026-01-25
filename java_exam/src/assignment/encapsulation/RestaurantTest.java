package assignment.encapsulation;

public class RestaurantTest {

	public static void main(String[] args) {

		Menu[] food = new Menu[4]; 
		food[0] = new Menu("짜장면", 7000, 500, 90);
		food[1] = new Menu("짬뽕", 8000, 600, 80);
		food[2] = new Menu("탕수육", 400, 15000, 100);
		food[3] = new Menu("볶음밥", 450, 8000, 70);
		Menu[] alcohol = new Menu[3]; 
		alcohol[0] = new Menu("소주", 6000, 17, 100);
		alcohol[1] = new Menu("맥주", 7000, 4, 200);
		alcohol[2] = new Menu("고량주", 15000, 35, 80);
		
		Restaurant chineseRest = new Restaurant("만리장성", food, alcohol, 20000, 70);
		Customer customer1 = new Customer("손님1", 35, 100000, 20, 80);
		
		chineseRest.acceptFoodOrder(customer1, 0, 2);
		chineseRest.acceptAlcoholOrder(customer1, 0, 1);

		Customer customer2 = new Customer("손님2", 19, 9000, 90, 0);
		
		chineseRest.acceptFoodOrder(customer2, 1, 1);
		chineseRest.acceptAlcoholOrder(customer2, 1, 2);


		food = new Menu[4]; 
		food[0] = new Menu("모듬전", 25000, 800, 90);
		food[1] = new Menu("해물파전", 18000, 550, 80);
		food[2] = new Menu("김치전", 12000, 300, 100);
		food[3] = new Menu("육전", 20000, 300, 70);
		alcohol = new Menu[3]; 
		alcohol[0] = new Menu("소주", 6000, 17, 100);
		alcohol[1] = new Menu("맥주", 7000, 4, 200);
		alcohol[2] = new Menu("막걸리", 4000, 5, 80);
		
		Restaurant koreanPancake = new Restaurant("전집", food, alcohol, 40000, 90);
		Customer customer3 = new Customer("손님3", 45, 12000, 20, 20);
		
		koreanPancake.acceptFoodOrder(customer3, 1, 1);
		koreanPancake.acceptAlcoholOrder(customer3, 1, 1);

		Customer customer4 = new Customer("손님4", 55, 200000, 20, 70);
		
		koreanPancake.acceptFoodOrder(customer4, 3, 2);
		koreanPancake.acceptAlcoholOrder(customer4, 2, 3);
		
		chineseRest.printRestaurantState();
		koreanPancake.printRestaurantState();
		
	}

}
