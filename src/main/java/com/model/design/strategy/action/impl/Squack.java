package com.model.design.strategy.action.impl;

import com.model.design.strategy.action.Quackable;

/**
 * @author bill shan
 * @create 2022-05-06 23:16
 */
public class Squack implements Quackable {
    @Override
    public void quack() {
        System.out.println("鸭子吱吱叫");
    }
}
