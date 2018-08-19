package com.braidsencurls.models;

public class Dolphin extends Animal {
	
	ISwim swim;
	
	public Dolphin() {
		
	}
	
	public Dolphin(ISwim swim) {
		super.setSwim(swim);
	}
	
	public void swim() {
		swim.swim();
	}

}
