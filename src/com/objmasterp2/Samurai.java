package com.objmasterp2;

public class Samurai extends Human{
	private static int numOfSamurai = 0;
	public Samurai () {
		this.health = 200;
		numOfSamurai++;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health = (int)(this.health/2);
	}
	
	public void meditate() {
		this.health+=(int)(this.health/2);
	}
	
	public void howMany() {
		System.out.println(numOfSamurai);
	}
}
