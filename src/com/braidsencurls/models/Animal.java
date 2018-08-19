package com.braidsencurls.models;

public class Animal {
	
	private IWalk walk;
	
	private IFly fly;
	
	private ISing sing;

	public Animal() {
		
	}
	
	public Animal(IWalk walk, IFly fly, ISing sing) {
		this.walk = walk;
		this.fly = fly;
		this.sing = sing;
	}
	
	public IWalk getWalk() {
		return walk;
	}

	public void setWalk(IWalk walk) {
		this.walk = walk;
	}

	public IFly getFly() {
		return fly;
	}

	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public ISing getSing() {
		return sing;
	}

	public void setSing(ISing sing) {
		this.sing = sing;
	}
	
}
