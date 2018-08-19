package com.braidsencurls.solutions;

import com.braidsencurls.models.Animal;
import com.braidsencurls.models.Fish;
import com.braidsencurls.models.ISing;
import com.braidsencurls.models.ISwim;
import com.braidsencurls.models.IWalk;
import com.braidsencurls.models.NoSing;
import com.braidsencurls.models.NoWalk;
import com.braidsencurls.models.SimpleSwim;

public class SolutionB1 {
	
	public static void main(String[] args) {
		
		ISwim fishSwim = new SimpleSwim();
		IWalk fishWalk = new NoWalk();
		ISing fishSing = new NoSing();
		
		Animal fish = new Fish(fishWalk, null, fishSing, null, fishSwim);
		fish.getWalk().walk();
		fish.getSing().sing();
		fish.getSwim().swim();
	}

}
