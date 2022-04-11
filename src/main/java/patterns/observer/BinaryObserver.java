package patterns.observer;

public class BinaryObserver implements Observer {
    public BinaryObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("Binary: " + Integer.toBinaryString(state));
    }
}
