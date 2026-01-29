package com.ktdsuniversity.edu.abstracts;

public class VIP extends Guest {

	private final static double DISCOUNT_RATE = 0.03;

	public VIP(int money, int point) {
		super(money, point);
	}

	public static double getDiscountRate() {
		return DISCOUNT_RATE;
	}

}
