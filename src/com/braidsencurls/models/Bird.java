package com.braidsencurls.models;

public class Bird extends Animal {
	
	public Bird() {
		
	}
	
	/*Inject the properties. Instead of writing the implementation of each method here,
	it's better to do composition as other Animals can have the same capabilities but it's not
	type of Bird*/
	public Bird(IWalk walk, IFly fly, ISing sing) {
		super(walk, fly, sing);
	}
	
	public void sing() {
		System.out.println("I am singing");
	}

}
