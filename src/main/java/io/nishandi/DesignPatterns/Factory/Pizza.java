package io.nishandi.DesignPatterns.Factory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	
	ArrayList toppings=new ArrayList<String>();
	
	void prepare() {
		System.out.println("Preparing:"+name);
		System.out.println("Tossing dough");
		System.out.println("adding sauce");
		System.out.println("adding toppings");
	    }
		
		void bake() {
		System.out.println("baking");
		}
		
		void cut() {
		System.out.println("cutting");
		}
		
		void box() {
		System.out.println("boxing");
		}
		
		public String getName() {
			return name;
		}

}
