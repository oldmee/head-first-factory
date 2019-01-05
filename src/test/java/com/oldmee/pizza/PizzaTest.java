package com.oldmee.pizza;

import com.oldmee.store.PizzaStore;
import com.oldmee.store.leagueStore.NYPizzaStore;
import org.junit.Test;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:55 2019/1/4
 */
public class PizzaTest {

    @Test
    public void pizzeTest() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
