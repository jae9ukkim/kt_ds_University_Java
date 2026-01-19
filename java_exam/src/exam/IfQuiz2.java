package exam;

public class IfQuiz2 {

	public static void main(String[] args) {
		int money = 1_000_000;

		int father = 40;
		int mother = 36;
		int daughter = 11;

		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		//Case 1. 비행 요금을 계산
		//int flightFare = 0;

		//Case 2. 성인의 수, 아동의 수.
//		int adultCount = 0;
//		int kidCount = 0;
//		flightFare = adultCount * adultOneWayFlightFare + kidCount * kidOneWayFlightFare;
		
		//Case 3. 비행 요금. 케이스 계산X
		// 삼항 연산. ==> if ~ else 대체. 권장하지 않음 - 성능이 다소 느리다.
		// 삼항 연산을 if~else로 바꿔서 기계어로 대체하기 때문에 느리다. 실무에서 미사용
		// 웹 어플리케이션 같이 이용자가 많은 경우 작은 성능의 차이도 누적되어 유의미한 차이가 생긴다
//		flightFare = father >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
//		flightFare += mother >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
//		flightFare += daughter >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		
		if (father >= 19) {
			money -= adultOneWayFlightFare;
		} else {
			money -= kidOneWayFlightFare;
		}

		if (mother >= 19) {
			money -= adultOneWayFlightFare;
		} else {
			money -= kidOneWayFlightFare;
		}

		if (daughter >= 19) {
			money -= adultOneWayFlightFare;
		} else {
			money -= kidOneWayFlightFare;
		}

		if (money >= 0) {
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에가자");
		}
	}

}
