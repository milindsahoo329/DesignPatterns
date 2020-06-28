package com.company.Template;

public class IOSCompiler extends CrossCompiler {

    @Override
    protected void collectSourceCode() {
        System.out.println("IOS compiler collecting source code");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("IOS compiler compiling code");
    }
}
