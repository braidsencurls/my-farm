package com.braidsencurls.models;

public class Duck extends Bird {
	
	public Duck() {
		
	}
	
	public Duck(IWalk walk, IFly fly, ISing sing, ITalk talk, ISwim swim) {
		super(walk, fly, sing, talk, swim);
	}

}
