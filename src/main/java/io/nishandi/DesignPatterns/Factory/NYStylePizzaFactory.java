package io.nishandi.DesignPatterns.Factory;

public class NYStylePizzaFactory  extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		
		return new NYStyleCheesePizza();
		 
	}
}
