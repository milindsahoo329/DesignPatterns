package com.company.Visitor;

public class VisitorExecutor  {

    public void execute(){

        Book book = new Book(25,"ISBN345");
        Fruit fruits = new Fruit(4,4);

        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartImpl();
        double sum = 0;
        sum = sum + book.accept(shoppingCartVisitor) + book.accept(shoppingCartVisitor);

        System.out.println("Sum = "+sum);

    }

}
