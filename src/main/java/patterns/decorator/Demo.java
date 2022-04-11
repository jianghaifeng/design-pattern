package patterns.decorator;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border:");
        circle.draw();

        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.println("Circle with red border");
        redRectangle.draw();
    }
}
