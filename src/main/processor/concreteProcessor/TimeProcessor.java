package processor.concreteProcessor;

import processor.ProcessorObserver;
import processor.Processor;

public class TimeProcessor extends Processor implements ProcessorObserver {


    @Override
    public void receivedEvent(String event) {
        this.event = event;
        System.out.println("Time Processor 이벤트 수신: " + event);
    }

    @Override
    public void eventProcess(String event) {
        System.out.println("Time Processor " + event + " 이벤트 처리 중: ");

    }

    @Override
    public void update(String event) {
        templateMethod(event);
    }
}
