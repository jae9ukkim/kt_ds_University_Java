package exam;

import java.util.Scanner;

public class Q2739 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int i = 1;
		
		while(true) {
			System.out.println(n + " * "+ i + " = " + n*i);			
			if(i++==9) {
				break;
			}
		}

	}

}
