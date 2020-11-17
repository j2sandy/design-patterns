package io.nishandi.DesignPatterns.SimpleFactory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza=null;
		if(type.equals("cheese"))
			pizza=new ChesseBurst();
		else if(type.equals("veg"))
			pizza=new SimplyVeg();
		
		return pizza;
		
	}

}
