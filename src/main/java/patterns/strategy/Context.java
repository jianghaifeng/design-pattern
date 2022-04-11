package patterns.strategy;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int num1, int num2) {
        return strategy.operate(num1, num2);
    }
}
