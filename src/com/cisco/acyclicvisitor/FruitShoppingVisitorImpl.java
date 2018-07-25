package com.cisco.acyclicvisitor;

/**
 * Created by shkk on 7/25/2018.
 */
public class FruitShoppingVisitorImpl implements FruitShoppingVisitor {

    @Override
    public int visit(Fruit fruit) {
        return fruit.getPricePerKg() * fruit.getWeight();
    }
}
