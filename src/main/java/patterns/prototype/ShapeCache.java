package patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String type) {
        Shape cachedShape = shapeMap.get(type);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache() {
        shapeMap.put("circle", new Circle());
        shapeMap.put("rectangle", new Rectangle());
        shapeMap.put("square", new Square());
    }
}

