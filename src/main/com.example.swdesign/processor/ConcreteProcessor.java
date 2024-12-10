package com.example.project.processor;

public class ConcreteProcessor extends Processor {

    @Override
    public void eventProcess(String event) {
        System.out.println("Processing event: " + event);
        notifyObservers(event);  // 모든 구독자에게 알림
    }
}
