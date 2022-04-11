package patterns.responsibilitychain;

public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level) {
        logLevel = level;
    }

    @Override
    void write(String message) {
        System.out.println("write log to console: " + message);
    }
}
