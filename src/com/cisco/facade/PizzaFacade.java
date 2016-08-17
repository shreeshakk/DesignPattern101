package com.cisco.facade;

/**
 * Created by shkk on 8/12/2016.
 */
public class PizzaFacade {

    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Topping topping;


    public PizzaFacade(Dough dough, Sauce sauce, Cheese cheese, Topping topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }

    public void makePizza() {

        dough.addSauce(sauce);
        dough.addCheese(cheese);
        dough.addTopping(topping);

        Oven oven = new Oven();
        oven.setTemparature(200);
        oven.setTimer(60);
        oven.cook(dough);

        System.out.println("Pizza of " + sauce.getSauce() + ":" + cheese.getCheese() + ":" + topping.getTopping() + " is done ");

    }

}
