package io.nishandi.DesignPatterns.Strategy;

public class ModelDuck extends Duck {

	@Override
	public void display() {
		System.out.println("model duck");
		
	}
	
	public ModelDuck() {
		quackBehavior=new Quack();
		flyBehavior=new FlyNoWay();
	}

}
