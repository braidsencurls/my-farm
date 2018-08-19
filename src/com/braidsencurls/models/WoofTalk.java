package com.braidsencurls.models;

/**
 * 
 * @author Christine
 * Implementation of ITalk that says Woof, woof
 */
public class WoofTalk implements ITalk {

	@Override
	public void talk() {
		System.out.println("Woof, woof");
	}

}
