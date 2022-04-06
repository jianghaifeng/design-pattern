package patterns.singleton;

public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");
        SingleObject singleObject;
        singleObject = SingleObject.getInstance();
        singleObject.showMessage();

        SingleObject1 object1;
        object1 = SingleObject1.getInstance();
        object1.showMessage();
    }
}
