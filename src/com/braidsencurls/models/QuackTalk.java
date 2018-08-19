package com.braidsencurls.models;

/**
 * 
 * @author User
 * Implementation of ITalk that says Quack, Quack
 */
public class QuackTalk implements ITalk {

	@Override
	public void talk() {
		System.out.println("Quack, Quack");
	}

}
