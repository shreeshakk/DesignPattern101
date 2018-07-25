package com.cisco.acyclicvisitor;

/**
 * Created by shkk on 7/25/2018.
 */
public interface BookShoppingVisitor extends ShoppingCartVisitor {

    int visit(Book book);
}
