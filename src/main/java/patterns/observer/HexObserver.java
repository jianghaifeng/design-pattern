package patterns.observer;

public class HexObserver implements Observer {
    public HexObserver(Subject subject) {
        subject.attach(this);

    }
    @Override
    public void update(int state) {
        System.out.println("Hex: " + Integer.toHexString(state));
    }
}
