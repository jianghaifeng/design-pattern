package patterns.observer;

public class Demo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctelObserver(subject);
        new HexObserver(subject);

        subject.setScore(17);
    }
}
