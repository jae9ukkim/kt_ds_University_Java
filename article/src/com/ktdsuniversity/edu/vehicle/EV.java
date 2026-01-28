package com.ktdsuniversity.edu.vehicle;

public class EV extends Vehicle {

	private int battery;

	public EV(String modelName, int battery) {
		super(modelName, "위이이잉!");
		this.battery = battery;
	}

	public int getBattery() {
		return this.battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public void checkBettery() {
		System.out.println("배터리 양 : " + this.battery);
	}
}
