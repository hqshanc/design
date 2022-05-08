package com.model.design.observer.subject;

import com.model.design.observer.observer.Observer;

/**
 * 主题抽象接口
 * @author bill shan
 * @create 2022-05-08 21:57
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
