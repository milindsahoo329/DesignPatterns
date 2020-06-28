package com.company.Template;

public abstract class CrossCompiler {

    public final void crossCompile(){
        collectSourceCode();
        compileToTarget();
    }

    protected abstract void collectSourceCode();
    protected abstract void compileToTarget();
}
