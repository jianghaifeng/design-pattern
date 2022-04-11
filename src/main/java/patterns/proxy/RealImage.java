package patterns.proxy;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("load from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Display image...");
    }
}
