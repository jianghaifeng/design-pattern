package patterns.singleton;

public class SingleObject1 {
    public static class SingletonHoder {
        public static final SingleObject1 instance = new SingleObject1();
    }

    private SingleObject1() {
        System.out.println("new SingleObject1");
    }

    public static final SingleObject1 getInstance() {
        System.out.println("get instance");
        return SingletonHoder.instance;
    }

    public void showMessage() {
        System.out.println("hello, world1!");
    }
}
