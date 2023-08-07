package com.xworkz.interfaces.app;

public class TirupatiRule implements TempleRule {

	@Override
	public void dressRule() {
		System.out.println("should wear dhoti");
	}

	@Override
	public void hairRule() {
		System.out.println("should shave head");
	}

}
