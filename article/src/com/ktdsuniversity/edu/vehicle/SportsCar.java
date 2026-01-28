package com.ktdsuniversity.edu.vehicle;

public class SportsCar extends Vehicle {

	private boolean isTurboMode;

	public SportsCar(String modelName) {
		super(modelName, "부아앙!");
	}

	public SportsCar(String modelName, String enginSound) {
		super(modelName, enginSound);
	}

	public boolean isTurboMode() {
		return this.isTurboMode;
	}

	public void setTurboMode(boolean isTurboMode) {
		this.isTurboMode = isTurboMode;
	}

	/**
	 * 터보모드
	 */
	public void pressTurboModeButton() {
		if (this.isTurboMode) {
			this.isTurboMode = false;
		} else {
			this.isTurboMode = true;
		}
	}
}
