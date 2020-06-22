package com.company.Visitor;


interface ShoppingCartVisitor {
    double visit(Book book);
    double visit(Fruit fruit);
}
