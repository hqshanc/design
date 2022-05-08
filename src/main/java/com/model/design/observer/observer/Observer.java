package com.model.design.observer.observer;

/**
 * 订阅者抽象接口
 * @author bill shan
 * @create 2022-05-08 21:59
 */
public interface Observer {
    /**
     * 观察者订阅内容修改
     * @param temp
     * @param humidity
     * @param presure
     */
    public void update(float temp, float humidity, float presure);
}
