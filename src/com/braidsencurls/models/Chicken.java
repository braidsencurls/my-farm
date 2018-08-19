package com.braidsencurls.models;

public class Chicken extends Bird {
	
	public Chicken() {
		
	}
	
	public Chicken(IWalk walk, IFly fly, ISing sing, ITalk talk, ISwim swim) {
		super(walk, fly, sing, talk, swim);
	}

}
