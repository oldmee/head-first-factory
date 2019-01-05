package com.oldmee.store;


import com.oldmee.pizza.Pizza;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:35 2019/1/4
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
