package com.company.Interpreter;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(data.contains(context)){
            return true;
        }
        return false;
    }

}
