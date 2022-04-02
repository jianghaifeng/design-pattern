package patterns.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) return null;

        if (factoryType.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }

        return null;
    }
}
