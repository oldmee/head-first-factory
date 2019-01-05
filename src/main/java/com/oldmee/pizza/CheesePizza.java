package com.oldmee.pizza;

import com.oldmee.factory.PizzaIngredientFactory;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 14:12 2019/1/5
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
