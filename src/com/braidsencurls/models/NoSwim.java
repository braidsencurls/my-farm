package com.braidsencurls.models;

/**
 * 
 * @author Christine
 * Implementation of ISwim that doesn't swim
 */
public class NoSwim implements ISwim {

	@Override
	public void swim() {
		System.out.println("I can't swim");
	}

}
