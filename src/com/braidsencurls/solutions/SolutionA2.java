package com.braidsencurls.solutions;

import com.braidsencurls.models.Bird;
import com.braidsencurls.models.Chicken;
import com.braidsencurls.models.CluckTalk;
import com.braidsencurls.models.Duck;
import com.braidsencurls.models.IFly;
import com.braidsencurls.models.ISwim;
import com.braidsencurls.models.ITalk;
import com.braidsencurls.models.IWalk;
import com.braidsencurls.models.NoFly;
import com.braidsencurls.models.NoSwim;
import com.braidsencurls.models.QuackTalk;
import com.braidsencurls.models.SimpleSwim;
import com.braidsencurls.models.SimpleWalk;

public class SolutionA2 {
	
	public static void main(String[] args) {
		IFly duckFly = new NoFly();
		ITalk duckTalk = new QuackTalk(); 
		ISwim duckSwim = new SimpleSwim();
		IWalk duckWalk = new SimpleWalk();
		
		IFly chickenFly = new NoFly();
		ITalk chickenTalk = new CluckTalk();
		ISwim chickenSwim = new NoSwim();
		IWalk chickenWalk = new SimpleWalk();
		
		Bird duck = new Duck(duckWalk, duckFly, null, duckTalk, duckSwim);
		Bird chicken = new Chicken(chickenWalk, chickenFly, null, chickenTalk, chickenSwim);
		
		System.out.println(" --- Duck --- ");
		duck.getWalk().walk();
		duck.getFly().fly();
		duck.getTalk().talk();
		duck.getSwim().swim();
		
		System.out.println(" --- Chicken --- ");
		chicken.getWalk().walk();
		chicken.getFly().fly();
		chicken.getTalk().talk();
		chicken.getSwim().swim();
		
		
	}

}
