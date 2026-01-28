package com.ktdsuniversity.edu.mart;

public class ConvenienceStore extends Mart {

	/**
	 * 포인트 지급 비율
	 */
	private static final double POINT_RATE = 0.1;

	public ConvenienceStore(Item[] item) {
		super(item);
	}

	/**
	 * 거스름돈
	 */
	public void refund() {

	}

	/**
	 * 포인트지급
	 */
	public void increPoint(Buyer buyer, int totalPrice) {
		buyer.setPoint(buyer.getPoint() + (int) (totalPrice * POINT_RATE));
	}
}
