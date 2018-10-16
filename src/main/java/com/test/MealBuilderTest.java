package com.test;

import com.build.KFCWaiter;
import com.build.trueBuilde.MealA;
import com.build.trueBuilde.MealB;
import com.mode.Meal;

/**
 * 建造者模式套餐测试
 */
public class MealBuilderTest {

    public static void main(String[] args) {

        MealA mealA = new MealA();
        KFCWaiter waiter = new KFCWaiter(mealA);
        Meal meal1 = waiter.construct();
        System.out.println(meal1);

        MealB mealB = new MealB();
        KFCWaiter waiter1 = new KFCWaiter(mealB);
        Meal meal = waiter1.construct();
        System.out.println(meal);
    }
}
