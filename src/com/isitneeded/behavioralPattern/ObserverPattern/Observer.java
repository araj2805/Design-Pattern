package com.isitneeded.behavioralPattern.ObserverPattern;

public interface Observer {

    //THis is push strategy where all states are pushed to observer but it'll fail when we need to add new state
    // then changes need to be done at all observer concrete implementation

//    public void update(Double temperature, Double humidity, Double pressure);

    // Design in order to support pull strategy for all Observer, So Observer is free to pull the relevant data from Subject sug getter.
    public void update();
}
