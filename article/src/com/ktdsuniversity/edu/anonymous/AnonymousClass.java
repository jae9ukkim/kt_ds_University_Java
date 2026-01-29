package com.ktdsuniversity.edu.anonymous;

import com.ktdsuniversity.edu.abstracts.AbstractMart;
import com.ktdsuniversity.edu.abstracts.Guest;
import com.ktdsuniversity.edu.implement.TV;

public class AnonymousClass {

	public static void main(String[] args) {
		// Cannot instantiate the type AbstractMart
		AbstractMart mart = new AbstractMart(1500) {

			@Override
			public int usePoint(Guest guest) {
				return 0;
			}

			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(1000_000);
			}

			@Override
			public int discount(Guest guest, int amount) {
				return amount;
			}
		};

		Guest guest = new Guest(0, 0);
		mart.sell(guest, 10000, 0);
		System.out.println(guest);

		TV emartTV = new TV() {

			@Override
			public void turnOn() {
				System.out.println("이마트TV 켬");
			}

			@Override
			public void turnOff() {
				System.out.println("이마트TV 끔");
			}

			@Override
			public void changeVolume(int volumn) {
				System.out.println("이마트TV 볼륨조정");
			}

			@Override
			public void changeChannel(int channelNumber) {
				System.out.println("이마트TV 채널조정");
			}
		};

		emartTV.turnOn();
		emartTV.changeChannel(5);
		emartTV.changeVolume(10);
		emartTV.turnOff();

		// com.ktdsuniversity.edu.anonymous.AnonymousClass$1@764c12b6
		System.out.println(mart);
		// com.ktdsuniversity.edu.anonymous.AnonymousClass$2@c387f44
		System.out.println(emartTV);
	}
}
