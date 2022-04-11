package patterns.responsibilitychain;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int WARNING = 2;
    public static int ERROR = 3;

    protected int logLevel;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger logger) {
        nextLogger = logger;
    }

    public void logMessage(int level, String message) {
        if (this.logLevel <= level)
            write(message);
        if (nextLogger != null)
            nextLogger.logMessage(level, message);
    }

    abstract void write(String message);
}
