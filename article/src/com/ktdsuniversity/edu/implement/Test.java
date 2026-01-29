package com.ktdsuniversity.edu.implement;

import com.ktdsuniversity.edu.coffee.LgSmartRemoteController;

public class Test {

	public static void main(String[] args) {
		LgSmartTV lgTV = new LgTV();
		LgRemoteController lgRemocon = new LgSmartRemoteController();
		lgRemocon.turnOn(lgTV);
		lgRemocon.runYoutube(lgTV);

		SamsungSmartTV samsungTV = new SamsungTV();
		lgRemocon.turnOn(samsungTV);
//		lgRemocon.runYoutube(samsungTV);

		SamsungSmartRemoteController samsungRemocon = new SamsungSmartRemoteController();
		samsungRemocon.runNetflix(samsungTV);
//		samsungRemocon.runNetflix(lgTV);
	}
}
