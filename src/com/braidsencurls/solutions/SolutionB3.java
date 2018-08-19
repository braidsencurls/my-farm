package com.braidsencurls.solutions;

import com.braidsencurls.models.Animal;
import com.braidsencurls.models.Dolphin;
import com.braidsencurls.models.SimpleSwim;

public class SolutionB3 {
	
	public static void main(String[] args) {
		Animal dolphin = new Dolphin(new SimpleSwim());
		dolphin.getSwim().swim();
		
	}

}
