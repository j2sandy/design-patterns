package io.nishandi.DesignPatterns.Factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore store=new ChicagoStylePizzaFactory();
		Pizza pizza=store.createPizza("cheese");
		System.out.println("Pizza created"+pizza.getName()+" "+pizza.dough+" "+pizza.sauce);
		
	}
}
