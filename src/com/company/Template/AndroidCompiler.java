package com.company.Template;

public class AndroidCompiler extends CrossCompiler {
    @Override
    protected void collectSourceCode() {
        System.out.println("Android Compiler - collect source code");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("Android Compiler - compiling to target");
    }
}
