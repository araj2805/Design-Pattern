package com.isitneeded.behavioralPattern.ObserverPattern;

public class CurrentConditionDisplay implements Observer,DisplayElement{

    private Double temperature;
    private Double humidity;
    private Double pressure;

    /*
    * Subject Reference is passed as it help to fetch data and help to register observer or delete observer from Subjct list.
    * */
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /*

    //THis is push strategy where all states are pushed to observer but it'll fail
    //when we need to add new state then changes need to be done at all observer concrete implementation

    public void update (Double temp, Double humidity, Double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
    */

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();

    }

    @Override
    public void display() {
        System.out.println("CurrentCondition => Temperature : "+temperature+"F Humidity : "+humidity+"% Pressure : "+pressure+" pascal");
    }


}
