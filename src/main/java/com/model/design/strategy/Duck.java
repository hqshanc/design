package com.model.design.strategy;

import com.model.design.strategy.action.Flyable;
import com.model.design.strategy.action.Quackable;

/**
 * 策略模式超类
 * @author bill shan
 * @create 2022-05-05 23:30
 */
public abstract class Duck {
//    public void quack(){
//        System.out.println("呱呱叫");
//    }
    /**
     * 飞行策略的顶层接口
     */
    private Flyable flyable;

    /**
     * 叫声策略的顶层接口
     */
    private Quackable quackable;

    /**
     * 全参构造，new对象时可以指定不同策略的实现
     * @param flyable
     * @param quackable
     */
    public Duck(Flyable flyable, Quackable quackable) {
        this.flyable = flyable;
        this.quackable = quackable;
    }

    public void swim(){
        System.out.println("游泳");
    }

    public abstract void display();

    public void performQuack(){
        quackable.quack();
    }

    public void performFly(){
        flyable.fly();
    }
}
