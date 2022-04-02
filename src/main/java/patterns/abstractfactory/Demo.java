package patterns.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        AbstractFactory color = FactoryProducer.getFactory("color");

        Shape rectangle = shape.getShape("rectangle");
        Color red = color.getColor("red");

        rectangle.draw();
        red.fill();

        Shape circle = shape.getShape("circle");
        Color green = color.getColor("green");

        circle.draw();
        green.fill();
    }
}
