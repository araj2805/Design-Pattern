package com.isitneeded.behavioralPattern.ObserverPattern;

public class WeatherStationTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurement(75d,65d,30.4);
        weatherData.setMeasurement(98d,65d,30.4);

        weatherData.removeObserver(statisticsDisplay);

        weatherData.setMeasurement(81d,86d,20.4);
    }
}
