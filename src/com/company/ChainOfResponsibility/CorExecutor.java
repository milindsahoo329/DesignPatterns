package com.company.ChainOfResponsibility;

public class CorExecutor {

    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public void execute(){

        AbstractLogger abstractLogger = getChainOfLoggers();

        abstractLogger.logMessage(AbstractLogger.INFO,"1 Info");
        abstractLogger.logMessage(AbstractLogger.ERROR,"2 Error");
        abstractLogger.logMessage(AbstractLogger.DEBUG,"3 Debug");

    }

}
