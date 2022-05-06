package com.model.design.strategy.subDuck;

import com.model.design.strategy.Duck;
import com.model.design.strategy.action.Flyable;
import com.model.design.strategy.action.Quackable;

/**
 * @author bill shan
 * @create 2022-05-05 23:36
 */
public class MallardDuck extends Duck{

    public MallardDuck(Flyable flyable, Quackable quackable) {
        super(flyable, quackable);
    }

    @Override
    public void display() {
        System.out.println("绿头");
    }

}
