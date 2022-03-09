package com.isitneeded.behavioralPattern.ObserverPattern;

public class ForecastDisplay implements Observer,DisplayElement {
    private Double temp;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemperature();
        display();
    }


    @Override
    public void display() {
        if (temp > 60 && temp < 80)
            System.out.println("Pleasant Weather");
        else if (temp > 80 && temp < 90)
            System.out.println("Windly Weather");
        else
            System.out.println("Bad Weather");
    }
}
