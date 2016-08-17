package com.cisco.facade;


/**
 * Created by shkk on 8/12/2016.
 */
public class PizzaTest {

    public static void main(String[] args) {

        Dough dough = new Dough();
        Sauce sauce = new Sauce("tomato");
        Cheese cheese = new Cheese("mozeralla");
        Topping topping = new Topping("bell peppers");


        PizzaFacade pizzaFacade = new PizzaFacade(dough, sauce, cheese, topping);
        pizzaFacade.makePizza(); // Pizza Ready :)

        Dough dough1 = new Dough();
        Sauce sauce1 = new Sauce("chilli");
        Cheese cheese1 = new Cheese("roquefort");
        Topping topping1 = new Topping("green peppers");

        PizzaFacade pizzaFacade1 = new PizzaFacade(dough1, sauce1, cheese1, topping1);
        pizzaFacade1.makePizza(); // Pizza Ready :)

    }

}
