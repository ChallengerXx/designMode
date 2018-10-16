package com.build;

import com.mode.Meal;

/**
 * 指挥者
 */
public class KFCWaiter {
    private MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        //准备套餐
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }
}
