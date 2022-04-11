package patterns.flyweight;

public class Demo {
    static String[] colors = new String[] {"red", "green", "blue", "yellow", "cyan"};

    public static void main(String[] args) {
        for (int i=0; i<20; i++) {
            String color = getRandomColor();
            Shape circle = ShapeFactory.getCircle(color);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        int index = (int)(Math.random() * colors.length);
        return colors[index];
    }
}
