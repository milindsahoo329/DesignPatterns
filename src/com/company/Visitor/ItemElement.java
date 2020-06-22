package com.company.Visitor;

public interface ItemElement {
    public double accept(ShoppingCartVisitor visitor);
}
