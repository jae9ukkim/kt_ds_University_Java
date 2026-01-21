package oop;

public class CarTest {

	public static void main(String[] args) {
		
		Car kona = new Car();
		System.out.println(kona);
		kona.pressEngineStartButton(); // 코나의 시동을 건다.
		kona.pressGasolinPedal(20); // speed : 30
		// kona의 엔진 상태를 출력한다.
		boolean konaEngineState = kona.isEngineStart;
		System.out.println("Kona Engine: " + konaEngineState);
		// kona의 현재 속도를 출력한다.
		int konaSpeed = kona.speed;
		System.out.println("Kona Speed: " + konaSpeed);
		
		Car carnival = new Car();
		System.out.println(carnival);

		carnival.pressGasolinPedal(200);
		carnival.pressEngineStartButton();
		carnival.pressBrakePedal(10);
		carnival.pressBrakePedal(10);
		
		boolean carnivalEngineState = carnival.isEngineStart;
		int carnivalSpeed = carnival.speed;
		System.out.println("carnival Engine: " + carnivalEngineState);
		System.out.println("carnival Speed: " + carnivalSpeed);
		
	}
}
