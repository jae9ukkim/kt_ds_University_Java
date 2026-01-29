package com.ktdsuniversity.edu.mart;

public class VIP extends Buyer{

	private final static double DISCOUNT_RATE = 0.03;

	public VIP(int money) {
		super(money);
	}
	
	public VIP(int money, int point) {
		super(money, point);
	}

	public static double getDiscountRate() {
		return DISCOUNT_RATE;
	}
}
