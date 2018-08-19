package com.braidsencurls.models;

public class Fish extends Animal {
	
	public Fish() {
		
	}
	
	public Fish(IWalk walk, IFly fly, ISing sing) {
		super(walk, fly, sing);
	}
	
	public Fish(IWalk walk, IFly fly, ISing sing, ITalk talk, ISwim swim) {
		super(walk, fly, sing, talk, swim);
	}
	
	

}
