package com.oldmee.factory;

import com.oldmee.ingredient.*;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:37 2019/1/5
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
