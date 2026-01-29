package com.ktdsuniversity.edu.abstracts;

public class DepartmentStore extends AbstractMart {

	public DepartmentStore(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		// 사용할 point. 10_000 이상
		if (guest.getPoint() >= 10000) {
			return (int) (Math.random() * (guest.getPoint() + 1));
		}
		return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {
		// 포인트 추가
		int point = 0;
		if (guest instanceof VVIP) {
			point = (int) (amount * VVIP.getPointRate());
		} else if (guest instanceof Guest) {
			point = (int) (amount * Guest.getPointRate());
		}
		guest.addPoint(point);

	}

	@Override
	public int discount(Guest guest, int amount) {
		if (guest instanceof VVIP) {
			return (int) (amount * VVIP.getDiscountRate());
		} else if (guest instanceof VIP) {
			return (int) (amount * VIP.getDiscountRate());
		}
		return 0;
	}

}
