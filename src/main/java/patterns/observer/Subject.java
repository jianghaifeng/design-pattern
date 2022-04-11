package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int score;
    private final List<Observer> observers = new ArrayList<>();

    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(score));
    }
}
