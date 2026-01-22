package oop;

public class CraneGameMachineTest {

	public static void main(String[] args) {
//		CraneGameMachine cgm = new CraneGameMachine();
		
//		cgm.dolls = 5;
//		cgm.doGame();
//		cgm.insertCoin();
//		cgm.doGame();
//		cgm.doGame();
//		while(cgm.dolls > 0) {
//			cgm.insertCoin();
//			cgm.doGame();			
//		}
//		System.out.println(cgm.dolls);
//		cgm.insertCoin();
		
//		cgm.isInsertCoin = false;
//		cgm.dolls = 10;
		CraneGameMachine cgm = new CraneGameMachine(false, 10);
		
		cgm.insertCoin();
		int result = cgm.doGame();
		
		System.out.println("isInsertCoin: " + cgm.isInsertCoin);
		System.out.println("남은 인형개수: " + cgm.dolls);
		System.out.println("뽑은 인형개수: " + result);
	}
}
