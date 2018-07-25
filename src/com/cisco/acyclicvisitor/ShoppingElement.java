package com.cisco.acyclicvisitor;

/**
 * Created by shkk on 7/25/2018.
 */
public interface ShoppingElement {

    public int accept(ShoppingCartVisitor visitor);
}
