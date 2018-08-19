package com.braidsencurls.solutions;

import com.braidsencurls.models.Bird;
import com.braidsencurls.models.CockadoodledooTalk;
import com.braidsencurls.models.IFly;
import com.braidsencurls.models.ISwim;
import com.braidsencurls.models.ITalk;
import com.braidsencurls.models.IWalk;
import com.braidsencurls.models.MeowTalk;
import com.braidsencurls.models.NoSwim;
import com.braidsencurls.models.Parrot;
import com.braidsencurls.models.SimpleFly;
import com.braidsencurls.models.SimpleWalk;
import com.braidsencurls.models.WoofTalk;

public class SolutionA4 {
	
	public static void main(String[] args) {
		IFly parrotFly = new SimpleFly();
		ISwim parrotSwim = new NoSwim();
		IWalk parrotWalk = new SimpleWalk();
		
		ITalk dogParrotTalk = new WoofTalk();
		ITalk catParrotTalk = new MeowTalk();
		ITalk roosterParrotTalk = new CockadoodledooTalk();
		
		Bird dogParrot = new Parrot(parrotWalk, parrotFly, null, dogParrotTalk, parrotSwim);
		Bird catParrot = new Parrot(parrotWalk, parrotFly, null, catParrotTalk, parrotSwim);
		Bird roosterParrot = new Parrot(parrotWalk, parrotFly, null, roosterParrotTalk, parrotSwim);
		
		System.out.println(" --- Dog Parrot --- ");
		dogParrot.getTalk().talk();
		
		System.out.println(" --- Cat Parrot --- ");
		catParrot.getTalk().talk();
		
		System.out.println(" --- Rooster Parrot --- ");
		roosterParrot.getTalk().talk();
		
		/*Note: If another parrot comes with different way of talking, another class should be created 
		implementing ITalk or uses existing ones like QuackTalk*/
		
	}

}
