package com.cisco.visitor;

/**
 * Created by shkk on 7/25/2018.
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        return book.getCost();
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.getPricePerKg() * fruit.getWeight();
    }
}
