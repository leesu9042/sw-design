import Monitor.ConcreteMonitor;
import Monitor.Monitor;
import processor.ConcreteProcessor;
import Actuator.ConcreteAction;

public class Application {
    public static void main(String[] args) {
        ConcreteMonitor concreteMonitor = new ConcreteMonitor();

        // 각 모니터 생성
        Monitor timeMonitor = concreteMonitor.new TimeMonitor();
        Monitor locationMonitor = concreteMonitor.new LocationMonitor();
        Monitor actMonitor = concreteMonitor.new ActMonitor();

        ConcreteProcessor processor = new ConcreteProcessor();

        // 각 모니터에 각 프로세서를 구독자로 등록
        timeMonitor.registerObserver(processor);
        locationMonitor.registerObserver(processor);
        actMonitor.registerObserver(processor);

        // Observers 생성
        ConcreteAction action1 = new ConcreteAction("Action 1");
        ConcreteAction action2 = new ConcreteAction("Action 2");

        // 구독자 등록 // 프로세서에 액션 구독자 등록
        processor.subscribe(action1);
        processor.subscribe(action2);

        // 이벤트 처리
        timeMonitor.detectEvent();
        processor.eventProcess("Event A");

        locationMonitor.detectEvent();
        processor.eventProcess("Event B");

        // 구독 해제
        processor.unsubscribe(action1);

        // 다시 이벤트 처리
        processor.eventProcess("Event C");
    }
}
