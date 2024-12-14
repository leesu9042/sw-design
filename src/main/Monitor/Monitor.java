package Monitor;

import processor.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Monitor implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public abstract void detectEvent();
}
