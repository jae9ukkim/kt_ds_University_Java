package exam;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		// 2부터 100_000까지의 숫자 중 소수(Prime Number : 약수가 1과 자신만 있는 수)를 출력
		for (int i = 2; i <= 100_000; i++) {
			for (int j = 2; j <= i; j++) {
				if(i % j == 0) {
					if(i != j) {
						break;
					} else {
						System.out.println(i);
					}
				}
			}
		}

	}

}
