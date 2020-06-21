package com.company.Interpreter;

public class InterpreterExecutor {

    public Expression getMaleExpression(){
        Expression john = new TerminalExpression("John Wick");
        Expression jack = new TerminalExpression("Jack Ryan");
        return new OrExpression(john,jack);
    }

    public Expression getStudentExpression(){
        Expression milind = new TerminalExpression("milind");
        Expression student = new TerminalExpression("student");
        return new AndExpression(milind,student);
    }

    public void execute(){
        Expression checkJackOrJohn = getMaleExpression();
        Expression studentMilind = getStudentExpression();
        System.out.println("Is jack or john  -  "+checkJackOrJohn.interpret("Jack"));
        System.out.println(studentMilind.interpret("milind"));
    }

}
