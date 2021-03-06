package com.objmasterp2;

public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		target.health += this.intelligence;
	}
	
	public void fireball(Human target) {
		target.health -= (3*this.intelligence);
	}
}
