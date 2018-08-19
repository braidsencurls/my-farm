package com.braidsencurls.solutions;

import com.braidsencurls.models.Bird;
import com.braidsencurls.models.IFly;
import com.braidsencurls.models.ISing;
import com.braidsencurls.models.IWalk;
import com.braidsencurls.models.SimpleFly;
import com.braidsencurls.models.SimpleSing;
import com.braidsencurls.models.SimpleWalk;

public class SolutionA1 {
	
	public static void main(String[] args) {
		IWalk walk = new SimpleWalk();
		IFly fly = new SimpleFly();
		ISing sing = new SimpleSing();
		
		Bird bird = new Bird(walk, fly, sing);
		bird.getWalk().walk();
		bird.getFly().fly();
		bird.getSing().sing();
	}

}
