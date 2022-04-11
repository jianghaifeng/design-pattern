package patterns.responsibilitychain;

public class Demo {
    public static void main(String[] args) {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.WARNING);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        consoleLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(fileLogger);

        consoleLogger.logMessage(AbstractLogger.INFO, "this is an info log");
        consoleLogger.logMessage(AbstractLogger.ERROR, "this is an error log");
        consoleLogger.logMessage(AbstractLogger.WARNING, "this is an warning log");
    }
}
