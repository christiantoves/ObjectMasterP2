package com.objmasterp2;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninja dipinder = new Ninja();
		Samurai sean = new Samurai();
		dipinder.steal(sean);
		sean.deathBlow(dipinder);
		dipinder.showHealth();
		sean.showHealth();
	}
}
