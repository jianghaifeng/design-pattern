package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Shape circle = shapeMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.println("create new circle in color " + color);
        }

        return circle;
    }
}
