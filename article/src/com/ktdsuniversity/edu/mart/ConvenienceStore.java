package com.ktdsuniversity.edu.mart;

public class ConvenienceStore extends Mart {

	/**
	 * 포인트 지급 비율
	 */
	private static final double POINT_RATE = 0.001;

	public ConvenienceStore(Item[] item) {
		super(item);
	}

	// 할인혜택 메소드

	/**
	 * 포인트지급
	 */
	public void increPoint(Buyer buyer, int totalPrice) {
		if (this instanceof DepartmentStore ds) {
			if(buyer instanceof VVIP) {
				buyer.setPoint(buyer.getPoint() + (int) (totalPrice * VVIP.getPointRate()));
			} else if(!(buyer instanceof VIP)) {
				buyer.setPoint(buyer.getPoint() + (int) (totalPrice * DepartmentStore.getPointRate()));
			}
		} else {
			buyer.setPoint(buyer.getPoint() + (int) (totalPrice * POINT_RATE));
		}
	}
}
