package patterns.proxy;

import javax.print.attribute.standard.RequestingUserName;

public class ImageProxy implements Image {
    private RealImage image;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(fileName);
        }
        image.display();
    }
}
