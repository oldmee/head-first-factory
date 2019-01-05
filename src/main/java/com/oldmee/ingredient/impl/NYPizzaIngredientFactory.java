package com.oldmee.ingredient.impl;

import com.oldmee.factory.PizzaIngredientFactory;
import com.oldmee.ingredient.*;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:49 2019/1/5
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new Dough();
    }

    public Sauce createSauce() {
        return new Sauce();
    }

    public Cheese createCheese() {
        return new Cheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    public Clams createClam() {
        return new Clams();
    }
}
