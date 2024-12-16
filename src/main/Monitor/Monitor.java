package monitor;

import processor.ProcessorObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Monitor implements Subject {
    private List<ProcessorObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ProcessorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ProcessorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String event) {
        for (ProcessorObserver observer : observers) {
            observer.update(event);
        }
    }

    public abstract void detectEvent();
}
