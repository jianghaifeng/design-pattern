package patterns.abstractfactory;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}
