package io.nishandi.DesignPatterns.JavaObserver;

import java.util.Observable;
import java.util.Observer;

import io.nishandi.DesignPatterns.Observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable=observable;
		observable.addObserver(this);
	}

	public void display() {
		System.out.println("displaying current weather conditions");
		
	}

	public void update(Observable obs, Object arg1) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
			}
		
	}

}
