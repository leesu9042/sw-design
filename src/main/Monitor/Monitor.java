package monitor;

import processor.ProcessorObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Monitor implements Subject {
    private List<ProcessorObserver> processorObservers = new ArrayList<>();

    @Override
    public void registerObserver(ProcessorObserver observer) {
        processorObservers.add(observer);
    }

    @Override
    public void removeObserver(ProcessorObserver observer) {
        processorObservers.remove(observer);
    }

    @Override
    public void notifyProcessorObserver(String event) {
        for (ProcessorObserver processorObserver : processorObservers) {
            processorObserver.update(event);
        }
    }

    public abstract void detectEvent(String event);
}
