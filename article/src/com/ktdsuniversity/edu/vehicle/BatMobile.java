package com.ktdsuniversity.edu.vehicle;

public class BatMobile extends SportsCar {

	private boolean isExistBatPod;

	public BatMobile(String modelName) {
		super(modelName, "부아아아아아아아아앙!!!");
		this.isExistBatPod = true;
	}

	public boolean isExistBatPod() {
		return this.isExistBatPod;
	}

	public void setExistBatPod(boolean isExistBatPod) {
		this.isExistBatPod = isExistBatPod;
	}

	/**
	 * 배트포드 분리
	 */
	public void devideBatPod() {
		this.isExistBatPod = false;
	}
}
