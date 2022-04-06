package patterns.builder;

public class Coke extends Drink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
