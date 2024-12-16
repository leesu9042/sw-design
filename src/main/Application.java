
import Actuator.AlramAction;
import Actuator.CallEmergency;
import monitor.ConcreteMonitor;
import monitor.Monitor;
import processor.Processor;
import processor.ProcessorObserver;
import processor.concreteProcessor.TimeProcessor;

public class Application {
    public static void main(String[] args) {

        // 모니터 및 프로세서 초기화
        ConcreteMonitor monitor = new ConcreteMonitor();
        Monitor timeMonitor = monitor.new TimeMonitor();

        // 프로세서 초기화 및 옵저버 등록
        TimeProcessor timeProcessor = new TimeProcessor();
        timeMonitor.registerObserver( timeProcessor);

        // 액션 인스턴스 생성
        CallEmergency action1 = new CallEmergency();
        AlramAction action2 = new AlramAction();


        // 액션 구독 등록
        timeProcessor.subscribe(action1);


        // 이벤트 감지 및 알림
        timeMonitor.detectEvent("Time event A");

        // 액션 구독 해제 및 재처리
        timeProcessor.subscribe(action2);


        timeMonitor.detectEvent("Time event B");
    }
}
