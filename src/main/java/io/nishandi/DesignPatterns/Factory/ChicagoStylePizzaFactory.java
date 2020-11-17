package io.nishandi.DesignPatterns.Factory;

public class ChicagoStylePizzaFactory extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		return new ChicagoStyleCheesePizza();
	}

}
