package com.ktdsuniversity.edu.mart;

public class DepartmentStore extends ConvenienceStore {

	/**
	 * 포인트 지급 비율
	 */
	private static final double POINT_RATE = 0.5;

	public DepartmentStore(Item[] item) {
		super(item);
	}

	public static double getPointRate() {
		return POINT_RATE;
	}

}
