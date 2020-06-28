package com.company.Template;

public class TemplateExecutor {

    public void execute(){
        CrossCompiler crossCompiler = new IOSCompiler();
        crossCompiler.collectSourceCode();
        crossCompiler.compileToTarget();

        crossCompiler = new AndroidCompiler();
        crossCompiler.collectSourceCode();
        crossCompiler.compileToTarget();
    }
}
