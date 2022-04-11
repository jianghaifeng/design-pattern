package patterns.proxy;

public class Demo {
    public static void main(String[] args) {
        Image image = new ImageProxy("pathForFile");

        image.display();
        System.out.println();
        image.display();
    }
}
