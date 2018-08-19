package com.braidsencurls.solutions;

import com.braidsencurls.models.Chicken;
import com.braidsencurls.models.CockadoodledooTalk;
import com.braidsencurls.models.IFly;
import com.braidsencurls.models.ISwim;
import com.braidsencurls.models.ITalk;
import com.braidsencurls.models.IWalk;
import com.braidsencurls.models.NoFly;
import com.braidsencurls.models.NoSwim;
import com.braidsencurls.models.Rooster;
import com.braidsencurls.models.SimpleWalk;

public class SolutionA3 {
	
	public static void main(String[] args) {
		IFly roosterFly = new NoFly();
		ITalk roosterTalk = new CockadoodledooTalk();
		ISwim roosterSwim = new NoSwim();
		IWalk roosterWalk = new SimpleWalk();
		
		Chicken rooster = new Rooster(roosterWalk, roosterFly, null, roosterTalk, roosterSwim);
		
		System.out.println(" --- Rooster --- ");
		rooster.getWalk().walk();
		rooster.getFly().fly();
		rooster.getTalk().talk();
		rooster.getSwim().swim();
	}

}
