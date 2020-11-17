package io.nishandi.DesignPatterns.Strategy;

public class MiniDuckSimulator {
   public static void main(String[] args) {
	Duck mallard=new Mallard();
	mallard.performFly();
	mallard.performQuack();
	
	Duck modelDuck=new ModelDuck();
	modelDuck.performFly();
	modelDuck.performQuack();
	modelDuck.setFlyBehavior(new FlyRocketPowered());
	modelDuck.performFly();
}
}
