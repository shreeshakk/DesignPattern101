package com.cisco.acyclicvisitor;

/**
 * Created by shkk on 7/25/2018.
 */
public class Book implements ShoppingElement {

    private int cost;

    private int isbn;

    public Book(int cost, int isbn) {
        this.cost = cost;
        this.isbn = isbn;
    }

    public int getCost() {
        return cost;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        BookShoppingVisitor bookVisitor = (BookShoppingVisitor) visitor;
        return bookVisitor.visit(this);
    }
}
