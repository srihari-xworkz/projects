package com.xworkz.abstraction.app.smartwatch;

public class FastTrack {
	private SmartWatch smartWatch;

	public FastTrack(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("smartwatch arg const of FastTrack");
	}

	public void check() {
		if (smartWatch != null) {
			System.out.println("not null");
			this.smartWatch.showTime();
		} else {
			System.out.println("null");
		}
	}
}
