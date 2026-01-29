package com.ktdsuniversity.edu.implement;

public interface RemoteController {

	void turnOn(TV tv);

	void turnOff(TV Tv);

	void changeChannel(TV Tv, int channelNumber);

	void changeVolume(TV Tv, int volumn);
}
