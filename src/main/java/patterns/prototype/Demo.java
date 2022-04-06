package patterns.prototype;

public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape circle = ShapeCache.getShape("circle");
        circle.draw();
        Shape rectangle = ShapeCache.getShape("rectangle");
        rectangle.draw();
        Shape square = ShapeCache.getShape("square");
        square.draw();
    }
}
