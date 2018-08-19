package com.braidsencurls.solutions;

import java.util.ArrayList;
import java.util.List;

import com.braidsencurls.models.*;

public class SolutionE {
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
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
		
		IFly roosterFly = new NoFly();
		ITalk roosterTalk = new CockadoodledooTalk();
		ISwim roosterSwim = new NoSwim();
		IWalk roosterWalk = new SimpleWalk();
		
		Chicken rooster = new Rooster(roosterWalk, roosterFly, null, roosterTalk, roosterSwim);
		
		IFly parrotFly = new SimpleFly();
		ISwim parrotSwim = new NoSwim();
		IWalk parrotWalk = new SimpleWalk();
		
		ITalk dogParrotTalk = new WoofTalk();
		ITalk catParrotTalk = new MeowTalk();
		ITalk roosterParrotTalk = new CockadoodledooTalk();
		
		ISing parrotSing = new SimpleSing();
		
		Bird dogParrot = new Parrot(parrotWalk, parrotFly, parrotSing, dogParrotTalk, parrotSwim);
		Bird catParrot = new Parrot(parrotWalk, parrotFly, parrotSing, catParrotTalk, parrotSwim);
		Bird roosterParrot = new Parrot(parrotWalk, parrotFly, parrotSing, roosterParrotTalk, parrotSwim);
		
		ISwim fishSwim = new SimpleSwim();
		IWalk fishWalk = new NoWalk();
		ISing fishSing = new NoSing();
		
		Animal fish = new Fish(fishWalk, null, fishSing, null, fishSwim);
		
		Animal dolphin = new Dolphin(new SimpleSwim());
		
		animals.add(duck);
		animals.add(chicken);
		animals.add(rooster);
		animals.add(dogParrot);
		animals.add(catParrot);
		animals.add(roosterParrot);
		animals.add(fish);
		animals.add(dolphin);
		
		int countSwim = 0;
		int countWalk = 0;
		int countSing = 0;
		int countFly = 0;
		
		for(Animal animal : animals) {
			if(animal.getFly() != null) {
				if(animal.getFly() instanceof NoFly == false) {
					countFly++;
				}
			}
			
			if(animal.getSwim() != null) {
				if(animal.getSwim() instanceof NoSwim == false) {
					countSwim++;
				}
			}
			
			if(animal.getWalk() != null) {
				if(animal.getWalk() instanceof NoWalk == false) {
					countWalk++;
				}
			}
			
			if(animal.getSing() != null) {
				if(animal.getSing() instanceof NoSing == false || animal.getSing() == null) {
					countSing++;
				}
			}
			
		}
		
		System.out.println("Swim Count: " + countSwim);
		System.out.println("Walk Count: " + countWalk);
		System.out.println("Sing count: " + countSing);
		System.out.println("Fly Count: " + countFly);
		
		
	}

}
