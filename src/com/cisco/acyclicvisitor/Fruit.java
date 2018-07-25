package com.cisco.acyclicvisitor;

/**
 * Created by shkk on 7/25/2018.
 */
public class Fruit implements ShoppingElement {

    private int pricePerKg;

    private int weight;

    private String name;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        FruitShoppingVisitor fruitShoppingVisitor = (FruitShoppingVisitor) visitor;
        return fruitShoppingVisitor.visit(this);
    }
}
