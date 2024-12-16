package monitor;

import processor.ProcessorObserver;

public interface Subject {
    void registerObserver(ProcessorObserver observer);
    void removeObserver(ProcessorObserver observer);
    void notifyObserver(String event);
}
