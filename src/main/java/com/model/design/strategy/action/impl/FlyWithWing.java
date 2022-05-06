package com.model.design.strategy.action.impl;

import com.model.design.strategy.action.Flyable;

/**
 * @author bill shan
 * @create 2022-05-06 23:14
 */
public class FlyWithWing implements Flyable {
    @Override
    public void fly() {
        System.out.println("飞行飞行");
    }
}
