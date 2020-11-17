package io.nishandi.DesignPatterns.Strategy;

public class Mallard extends Duck{

	@Override
	public void display() {
		System.out.println("mallard duck");
		
	}
	
	public Mallard() {
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
	}

}
