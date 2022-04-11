package patterns.responsibilitychain;

public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        logLevel = level;
    }

    @Override
    void write(String message) {
        System.out.println("write log to file: " + message);
    }
}
