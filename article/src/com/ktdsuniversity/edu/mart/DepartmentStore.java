package com.ktdsuniversity.edu.mart;

public class DepartmentStore extends ConvenienceStore {

	/**
	 * 포인트 지급 비율
	 */
	private static final double POINT_RATE = 0.005;

	public DepartmentStore(Item[] item) {
		super(item);
	}

	public static double getPointRate() {
		return POINT_RATE;
	}

	public int applyPromotion(Buyer buyer, int priceToPay) {
		if(buyer instanceof VVIP) {
			priceToPay *= 0.9;
		} else if(buyer instanceof VIP) {
			priceToPay *= 0.97;
		}
		return (int)priceToPay;
	}
}
