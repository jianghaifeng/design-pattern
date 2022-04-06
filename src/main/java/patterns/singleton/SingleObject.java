package patterns.singleton;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
        System.out.println("new SingleObject");
    }

    public static SingleObject getInstance() {
        System.out.println("get instance");
        return instance;
    }

    public void showMessage() {
        System.out.println("hello, world!");
    }
}
