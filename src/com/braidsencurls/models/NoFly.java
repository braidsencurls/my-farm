package com.braidsencurls.models;

/**
 * 
 * @author Christine
 * Implementation of IFly that doesn't fly
 */
public class NoFly implements IFly {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
	
	

}
