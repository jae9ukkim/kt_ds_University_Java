package exam;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int sum = 0;
		int i = 0;
		
		while(true) {
			sum += i;
			if(i++ == n) {
				break;
			}
		}
		System.out.println(sum);

	}

}
