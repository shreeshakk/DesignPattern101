package com.cisco.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shkk on 7/25/2018.
 */
public class ShoppingTest {

    public static void main(String[] args) {

        List<ShoppingElement> shoppingElementList = new ArrayList<ShoppingElement>();
        Book book1 = new Book(50, 3442);
        Book book2 = new Book(100, 2344);

        Fruit fruit1 = new Fruit(100, 2, "Apple");
        Fruit fruit2 = new Fruit(50, 1, "Orange");

        shoppingElementList.add(book1);
        shoppingElementList.add(book2);
        shoppingElementList.add(fruit1);
        shoppingElementList.add(fruit2);

        int shoppingCost = calculateCost(shoppingElementList);
        System.out.println("Total Cost : " + shoppingCost);
    }

    public static int calculateCost(List<ShoppingElement> shoppingElementList) {
        int initialCost = 0;
        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
        for (ShoppingElement shoppingElement : shoppingElementList) {
            initialCost += shoppingElement.accept(shoppingCartVisitor);
        }
        return initialCost;
    }
}
