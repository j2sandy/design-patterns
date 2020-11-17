package io.nishandi.DesignPatterns.Observer;

public class HeatIndexDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Heat Index:"+this.temperature+this.humidity*56);
		
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		display();
	}

	
}
