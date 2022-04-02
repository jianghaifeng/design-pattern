package patterns.abstractfactory;

public interface AbstractFactory {
    public Shape getShape(String shapeType);
    public Color getColor(String colorType);
}
