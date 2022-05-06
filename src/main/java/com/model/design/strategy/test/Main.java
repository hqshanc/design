package com.model.design.strategy.test;

import com.model.design.strategy.Duck;
import com.model.design.strategy.action.impl.FlyNoway;
import com.model.design.strategy.action.impl.FlyWithWing;
import com.model.design.strategy.action.impl.Quack;
import com.model.design.strategy.action.impl.Squack;
import com.model.design.strategy.subDuck.MallardDuck;
import com.model.design.strategy.subDuck.RedHeadDuck;

/**
 * @author bill shan
 * @create 2022-05-05 23:40
 */
public class Main {
    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck(new FlyWithWing(), new Squack());
        MallardDuck mallardDuck = new MallardDuck(new FlyNoway(),new Quack());

        redHeadDuck.performQuack();
        redHeadDuck.swim();
        redHeadDuck.display();
        redHeadDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.performFly();
    }
}
