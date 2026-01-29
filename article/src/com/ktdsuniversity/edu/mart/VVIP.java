package com.ktdsuniversity.edu.mart;

public class VVIP extends Buyer{

	private final static double DISCOUNT_RATE = 0.1;
	private final static double POINT_RATE = 0.03;

	public VVIP(int money) {
		super(money);
	}
	
	public VVIP(int money, int point) {
		super(money, point);
	}

	public static double getDiscountRate() {
		return DISCOUNT_RATE;
	}

	public static double getPointRate() {
		return POINT_RATE;
	}
}
