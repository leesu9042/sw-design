package processor;

import tmp.ConcreteAction;
import tmp.Action;




import java.util.ArrayList;
import java.util.List;


// subject + template method

public abstract class Processor implements ProcessorObserver  {
    protected List<Action> actions = new ArrayList<>();
    protected String event;

    // 초기화 메서드를 명시적으로 정의




    public void subscribe(Action action) {
        actions.add(action);
        System.out.println("Action subscribed.");
    }

    public void unsubscribe(ConcreteAction action) {
        actions.remove(action);
        System.out.println("Action unsubscribed.");
    }



    protected void notifyObservers(String data) {
        for (Action action : actions) {
            action.update();
        }
    }

    // event 수신 메서드
    protected void receivedData(String event) {
        this.event = event;
        System.out.println("Data received: " + event);
    }




    protected void templateMethod(String event) {
        receivedData(event);
        eventProcess(event);
        notifyObservers(event);

    }


    public abstract void eventProcess(String event); { // 템플릿 메서드 (추상)
        System.out.println("Event processed: " + event);
    }



    // 템플릿 메서드 호출
    @Override
    public void update(String event) {
        templateMethod(event);
    }




}
