package com.build.trueBuilde;

import com.build.MealBuilder;

/**
 * 具体建造者A
 */
public class MealA extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
