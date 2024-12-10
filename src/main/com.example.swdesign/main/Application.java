package com.example.project.main;

import com.example.project.processor.ConcreteProcessor;
import com.example.project.observer.ConcreteAction;

public class Application {
    public static void main(String[] args) {
        ConcreteProcessor processor = new ConcreteProcessor();

        예시

        // Observers 생성
        ConcreteAction action1 = new ConcreteAction("Action 1");
        ConcreteAction action2 = new ConcreteAction("Action 2");

        // 구독자 등록
        processor.subscribe(action1);
        processor.subscribe(action2);

        // 이벤트 처리
        processor.eventProcess("Event A");
        processor.eventProcess("Event B");

        // 구독 해제
        processor.unsubscribe(action1);

        // 다시 이벤트 처리
        processor.eventProcess("Event C");


    }
}
