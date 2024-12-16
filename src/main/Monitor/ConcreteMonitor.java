package monitor;

import monitor.Monitor;

public class ConcreteMonitor {
    // 시간 모니터
    public class TimeMonitor extends Monitor {
        @Override
        public void detectEvent(String event) {

            System.out.println("TimeMonitor - 이벤트 감지: " + event);
            notifyProcessorObserver(event);
        }
    }

    class LocationMonitor extends Monitor {
        @Override
        public void detectEvent(String event) {
//            String event = "도착";
            System.out.println("LocationMonitor - 이벤트 감지 : " + event);
            notifyProcessorObserver(event);
        }
    }

    class ActMonitor extends Monitor {
        @Override
        public void detectEvent(String event) {
//            String event = "행동 감지";
            System.out.println("ActMonitor - 이벤트 감지: " + event);
            notifyProcessorObserver(event);
        }
    }
}
