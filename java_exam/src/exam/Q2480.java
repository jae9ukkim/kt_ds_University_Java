package exam;

public class Q2480 {

	public static void main(String[] args) {
		int dice[] = { 3, 3, 6 };
		int prize = 0;
		
		if (dice[0] == dice[1] && dice[0] == dice[2]) {
			prize += 10000;
			prize += dice[0] * 1000;
		} else if(dice[0] == dice[1] || dice[0] == dice[2]) {
			prize += 1000;
			prize += dice[0] * 100;
		} else if(dice[1] == dice[2] ) {
			prize += 1000;
			prize += dice[1] * 100;
		} else {
			if(dice[0] > dice[1] && dice[0] > dice[2]) {
				prize += dice[0] * 100;
			} else if(dice[1] > dice[0] && dice[1] > dice[2]) {
				prize += dice[1] * 100;
			} else {
				prize += dice[2] * 100;
			}
		}
		System.out.println(prize);

		int dice1 = 2;
		int dice2 = 2;
		int dice3 = 2;
		prize = 0;
		
		if (dice1 == dice2 && dice1 == dice3) {
			prize += 10000;
			prize += dice1 * 1000;
		} else if(dice1 == dice2 || dice1 == dice3) {
			prize += 1000;
			prize += dice1 * 100;
		} else if(dice2== dice3) {
			prize += 1000;
			prize += dice2 * 100;
		} else {
			if(dice1 > dice2 && dice1 > dice3) {
				prize += dice1 * 100;
			} else if(dice2 > dice1 && dice2 > dice3) {
				prize += dice2 * 100;
			} else {
				prize += dice3 * 100;
			}
		}
		System.out.println(prize);
		
		dice1 = 6;
		dice2 = 2;
		dice3 = 5;
		prize = 0;
		
		if (dice1 == dice2 && dice1 == dice3) {
			prize += 10000;
			prize += dice1 * 1000;
		} else if(dice1 == dice2 || dice1 == dice3) {
			prize += 1000;
			prize += dice1 * 100;
		} else if(dice2== dice3) {
			prize += 1000;
			prize += dice2 * 100;
		} else {
			if(dice1 > dice2 && dice1 > dice3) {
				prize += dice1 * 100;
			} else if(dice2 > dice1 && dice2 > dice3) {
				prize += dice2 * 100;
			} else {
				prize += dice3 * 100;
			}
		}
		System.out.println(prize);

		

	}

}
