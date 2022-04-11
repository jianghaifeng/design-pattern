package patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorderRed();
    }

    private void setBorderRed() {
        System.out.println("Border Color: Red");
    }
}
