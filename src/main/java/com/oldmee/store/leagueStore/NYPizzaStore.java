package com.oldmee.store.leagueStore;

import com.oldmee.factory.PizzaIngredientFactory;
import com.oldmee.ingredient.impl.NYPizzaIngredientFactory;
import com.oldmee.pizza.CheesePizza;
import com.oldmee.pizza.ClamPizza;
import com.oldmee.pizza.Pizza;
import com.oldmee.store.PizzaStore;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:40 2019/1/4
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else {
            return null;
        }
        return pizza;
    }
}
