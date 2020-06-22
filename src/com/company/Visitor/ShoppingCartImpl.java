package com.company.Visitor;

public class ShoppingCartImpl implements ShoppingCartVisitor {



    @Override
    public double visit(Book book) {
        return book.getPrice() * 0.95;
    }

    @Override
    public double visit(Fruit fruit) {
        return fruit.getPrice() * fruit.getWeight();
    }
}
