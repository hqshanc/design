package com.model.design.observer;

import com.model.design.observer.observer.CurrentConditionsDisplay;
import com.model.design.observer.subject.impl.WeatherData;

/**
 * @author bill shan
 * @create 2022-05-08 22:21
 */
public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay();
        data.registerObserver(display);

        data.setMeasurements(1,1,1);
        data.setMeasurements(2,1,1);
        data.setMeasurements(3,1,1);
    }
}
