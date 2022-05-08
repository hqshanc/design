package com.model.design.observer.observer;

/**
 * 当前天气情况观察者
 * @author bill shan
 * @create 2022-05-08 22:14
 */
public class CurrentConditionsDisplay implements Observer {
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("TEMP:" + temp +";HUMIDITY:" + humidity + ";PRESSURE:" + pressure);
    }
}
