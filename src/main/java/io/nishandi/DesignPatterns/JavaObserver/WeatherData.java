package io.nishandi.DesignPatterns.JavaObserver;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float t,float h,float p) {
		this.humidity=h;
		this.pressure=p;
		this.temperature=t;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	

}
