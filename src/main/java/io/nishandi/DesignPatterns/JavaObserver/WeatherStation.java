package io.nishandi.DesignPatterns.JavaObserver;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay conditionsDisplay=new  CurrentConditionsDisplay(weatherData);
		//HeatIndexDisplay heatIndexDisplay=new HeatIndexDisplay(weatherData);
		weatherData.setMeasurements(80, 60, 30.2f);
		weatherData.setMeasurements(30, 40, 34.4f);
		weatherData.setMeasurements(24, 23, 30.2f);
		
	}

}
