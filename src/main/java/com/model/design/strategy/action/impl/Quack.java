package com.model.design.strategy.action.impl;

import com.model.design.strategy.action.Quackable;

/**
 * @author bill shan
 * @create 2022-05-06 23:16
 */
public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("实现鸭子呱呱叫");
    }
}
