package com.model.design.observer.subject.impl;

import com.model.design.observer.observer.Observer;
import com.model.design.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式  气象数据  发布者->订阅者
 * 主要包含一个发布者和若干订阅者
 * @author bill shan
 * @create 2022-05-08 21:50
 */
public class WeatherData implements Subject {
    /**
     * 观察者列表，其中的每个成员都订阅了该发布者的内容
     */
    private List<Observer> observers = new ArrayList<>();

    private float temperature;

    private float humidity;

    private float pressure;

    /**
     * 注册订阅者（观察者）
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除订阅者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有订阅者
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
