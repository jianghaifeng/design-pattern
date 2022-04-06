package patterns.builder;

public class Pepsi extends Drink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 9.0f;
    }
}
