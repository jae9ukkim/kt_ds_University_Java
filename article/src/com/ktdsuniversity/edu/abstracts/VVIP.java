package com.ktdsuniversity.edu.abstracts;

public class VVIP extends VIP {

	private final static double DISCOUNT_RATE = 0.1;
	private final static double POINT_RATE = 0.03;

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
