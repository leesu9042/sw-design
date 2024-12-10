package com.example.project.processor;

import com.example.project.observer.Action;
import java.util.ArrayList;
import java.util.List;

public abstract class Processor {
    protected List<Action> actions = new ArrayList<>();

    public void subscribe(Action action) {
        actions.add(action);
        System.out.println("Action subscribed.");
    }

    public void unsubscribe(Action action) {
        actions.remove(action);
        System.out.println("Action unsubscribed.");
    }

    protected void notifyObservers(String event) {
        for (Action action : actions) {
            action.update(event);
        }
    }

    public abstract void eventProcess(String event);  // 템플릿 메서드 (추상)
}
