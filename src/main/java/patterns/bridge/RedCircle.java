package patterns.bridge;

public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("draw red circle: (" + x + "," + y + ")" + ",radius=" + radius);
    }
}
