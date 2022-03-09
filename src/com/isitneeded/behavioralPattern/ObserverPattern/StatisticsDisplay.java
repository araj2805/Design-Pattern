package com.isitneeded.behavioralPattern.ObserverPattern;

public class StatisticsDisplay implements Observer,DisplayElement{

    private static Double maxTemp = Double.MIN_VALUE;
    private static Double minTemp = Double.MAX_VALUE;
    private static Double avgTemp ;
    private static Double temp = 0d ;
    private static Integer count = 0;

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay : Maximum Temperature : "+maxTemp+"F Minimum Temperature : "+minTemp+"F Average Temperature : "+avgTemp+"F");
    }

    @Override
    public void update() {
        maxTemp = Math.max(maxTemp,weatherData.getTemperature());
        minTemp = Math.min(minTemp,weatherData.getTemperature());

        Double prevAvgTemp = temp;
        temp = weatherData.getTemperature();

        count++;
        avgTemp = (temp + prevAvgTemp) / count;

        display();
    }
}
