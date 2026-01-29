package com.ktdsuniversity.edu.abstracts;

public class Guest {

	private final static double POINT_RATE = 0.005;
	private int money;
	private int point;

	public Guest(int money) {
		this(money, 0);
	}

	public Guest(int money, int point) {
		this.money = money;
		this.point = point;
	}

	public static double getPointRate() {
		return POINT_RATE;
	}

	public int getPoint() {
		return this.point;
	}

	public void usePoint(int point) {
		this.point -= point;
	}

	public void addPoint(int point) {
		this.point += point;
	}

	public void pay(int amount) {
		this.money -= amount;
	}

	public void giveMoney(int remainMoney) {
		this.money += remainMoney;
	}

	@Override
	public String toString() {
		return "고객에게 남은 돈: " + this.money;
	}

}
