package oop;

public class CraneGameMachine {
	
	boolean isInsertCoin;
	int dolls;
	
	public CraneGameMachine(boolean isInsertCoin, int dolls) {
		this.isInsertCoin = isInsertCoin;
		this.dolls = dolls;
	}
	
	public void insertCoin() {
		if(dolls <= 0) {
			System.out.println("인형이 없습니다.");
			return;
		}
		isInsertCoin = true;
	}
	
	public int doGame() {
		int crankedDoll = 0;
		
		if(!isInsertCoin) {
			System.out.println("동전을 넣어주세요.");
			return 0;
		}
		crankedDoll = (int)(Math.random() * 2);
		dolls -= crankedDoll;
		isInsertCoin = false;
		return crankedDoll;
	}
}
