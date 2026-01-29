package com.ktdsuniversity.edu.coffee;

import com.ktdsuniversity.edu.implement.LgRemoteController;
import com.ktdsuniversity.edu.implement.LgSmartTV;
import com.ktdsuniversity.edu.implement.TV;

public class LgSmartRemoteController implements LgRemoteController {

	@Override
	public void turnOn(TV tv) {
		tv.turnOn();
	}

	@Override
	public void turnOff(TV Tv) {
		Tv.turnOff();
	}

	@Override
	public void changeChannel(TV Tv, int channelNumber) {

	}

	@Override
	public void changeVolume(TV Tv, int volumn) {

	}

	@Override
	public void runNetflix(LgSmartTV tv) {
		tv.runNetflix();
	}

	@Override
	public void runInternet(LgSmartTV tv) {
		tv.runInternet();
	}

	@Override
	public void runYoutube(LgSmartTV tv) {
		tv.runYoutube();
	}

}
