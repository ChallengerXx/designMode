package com.build.trueBuilde;

import com.build.MealBuilder;

public class MealB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("柠檬果汁");
    }
}
