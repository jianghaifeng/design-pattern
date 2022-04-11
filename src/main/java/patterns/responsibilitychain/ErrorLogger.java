package patterns.responsibilitychain;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        logLevel = level;
    }

    @Override
    void write(String message) {
        System.out.println("write log to error: " + message);
    }
}
