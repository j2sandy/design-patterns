package io.nishandi.DesignPatterns.Factory;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name="Chicago cheese pizza";
		dough="wheat crust";
		sauce="marianara";
		toppings.add("grated cheese");
		this.prepare();
	}
	
	@Override
	void cut() {
		System.out.println("cutting into square slices");
	}

}
