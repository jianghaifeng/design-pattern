package patterns.bridge;

public class Demo {

    public static void main(String[] args) {
        Shape shape = new Circle(0, 0, 2, new RedCircle());
        shape.draw();
    }
}
