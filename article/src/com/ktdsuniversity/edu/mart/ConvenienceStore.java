package com.ktdsuniversity.edu.mart;

public class ConvenienceStore extends Mart {

	/**
	 * 포인트 지급 비율
	 */
	private static final double POINT_RATE = 0.1;

	public ConvenienceStore(Item[] item) {
		super(item);
	}

	// 할인혜택 메소드

	/**
	 * 포인트지급
	 */
	public void increPoint(Buyer buyer, int totalPrice) {
		if (this instanceof DepartmentStore ds) {
			buyer.setPoint(buyer.getPoint() + (int) (totalPrice * DepartmentStore.getPointRate()));
		} else {
			buyer.setPoint(buyer.getPoint() + (int) (totalPrice * POINT_RATE));
		}
	}

	public int applyPromotion(Buyer buyer, int priceToPay) {
		if (this instanceof DepartmentStore ds) {

			return 0;
		} else {
			if (buyer.getPoint() >= 100) {
				if (priceToPay < buyer.getPoint()) {
					buyer.setPoint(buyer.getPoint() - priceToPay);
					// payToprice = 0
					return 0;
				} else {
					buyer.setPoint(0);
//					priceToPay -= this.point;
					return priceToPay - buyer.getPoint();
				}
			}
			return 0;
		}
	}
}
