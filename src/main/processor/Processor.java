package processor;

import Actuator.ActionObserver;
import java.util.ArrayList;
import java.util.List;

// Subject + Template Method
public abstract class Processor implements ProcessorObserver {
    protected List<ActionObserver> actions = new ArrayList<>();
    protected String event;

    // 구독 등록
    public void subscribe(ActionObserver action) {
        actions.add(action);
        System.out.println(action + "이(가) 구독되었습니다.");
    }

    // 구독 해제
    public void unsubscribe(ActionObserver action) {
        actions.remove(action);
        System.out.println(action + " - 액션이 구독 해제되었습니다.");
    }

    // 이벤트 수신 메서드
    public abstract void receivedEvent(String event);

    // 액션 알림
    protected void notifyActionObservers(String event) {
        for (ActionObserver action : actions) {
            action.update(event);
        }
    }

    // 템플릿 메서드
    protected void templateMethod(String event) {
        receivedEvent(event);
        eventProcess(event);
        notifyActionObservers(event);
    }

    public void update(String event){
        templateMethod(event);
    }





    // 추상 메서드 - 서브클래스에서 구현 필요
    public abstract void eventProcess(String event);
}
