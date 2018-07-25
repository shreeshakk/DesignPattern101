package com.cisco.acyclicvisitor;

/**
 * Created by shkk on 7/25/2018.
 */
public class BookShoppingVisitorImpl implements BookShoppingVisitor {

    @Override
    public int visit(Book book) {
        return book.getCost();
    }
}
