package processor;

import Actuator.ConcreteAction;

public class ConcreteProcessor extends Processor implements Observer {

    @Override
    public void eventProcess(String event) {
        System.out.println("Processing event: " + event);
        notifyObservers(event);  // 모든 구독자에게 알림
    }

    public void subscribe(ConcreteAction action1) {

    }

    @Override
    public void update(String event) {
        System.out.println("수신한 이벤트 : " + event);
        notifyObservers(event);
    }
}
