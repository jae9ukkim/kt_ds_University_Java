package com.ktdsuniversity.edu.vehicle;

public class Vehicle {

	private String modelName;
	private boolean isEngineStart;
	private String engineSound;

	public Vehicle(String modelName) {
		this.modelName = modelName;
		this.engineSound = "부르릉";
	}

	public Vehicle(String modelName, String engineSound) {
		this.modelName = modelName;
		this.engineSound = engineSound;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public boolean isEngineStart() {
		return this.isEngineStart;
	}

	public void setEngineStart(boolean isEngineStart) {
		this.isEngineStart = isEngineStart;
	}

	/**
	 * 시동걸기
	 */
	public void pressEngineStartButton() {
		System.out.println(this.engineSound);
		this.isEngineStart = true;
	}

	public void pressEngineStopButton() {
		this.isEngineStart = false;
	}
}
