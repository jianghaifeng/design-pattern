package patterns.observer;

public class OctelObserver implements Observer {
    public OctelObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("Octel: " + Integer.toOctalString(state));
    }
}
