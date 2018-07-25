package com.cisco.visitor;

/**
 * Created by shkk on 7/25/2018.
 */
public interface ShoppingCartVisitor {

    public int visit(Book book);

    public int visit(Fruit fruit);
}
