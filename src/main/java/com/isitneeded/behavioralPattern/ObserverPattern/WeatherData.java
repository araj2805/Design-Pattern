package com.isitneeded.behavioralPattern.ObserverPattern;


import java.util.ArrayList;
import java.util.List;

/*
*Observer Pattern defines a one to many dependency between objects so that when one object changes state , all of its dependents are notified and update automatically.
* */
public class WeatherData implements Subject{

    private Double temperature;
    private Double humidity;
    private Double pressure;

    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    public void setMeasurement(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // When new weather data comes then it'll call measurementChanged() to notify all other display
        measurementChanged();
    }


    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            // Here we are pushing state to all observer but rather pushing allow observer to pull the relevant data from it.
//            observer.update(temperature,humidity,pressure);

            observer.update();
        }
    }


    /*
    *
    * This method get called whenever the weather measurement have been updated
    * */

    public void measurementChanged() {

        /*
        * Initial Setup
        *
        * */

//        Double temp = getTemperature();
//        Double humidity = getHumidity();
//        Double pressure = getPressure();
//
//
//        // THese are concrete implementation for display So, new display it cannot support and we need to change code
//        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
//        ForecastDisplay forecastDisplay = new ForecastDisplay();
//
//        // Notifying all other display
//        currentConditionDisplay.update(temp,humidity,pressure);
//        statisticsDisplay.update(temp,humidity,pressure);
//        forecastDisplay.update(temp,humidity,pressure);


        /*
        * THis method will handle the case and notify all the observer that state of Subject has been changed
        *
        * */
        notifyObserver();
    }

    /*
    * Getter
    * */
    public Double getTemperature() {
        return temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }
}
