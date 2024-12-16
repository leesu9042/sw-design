package Monitor;

public class ConcreteMonitor {
    // 시간 모니터
    public class TimeMonitor extends Monitor {
        @Override
        public void detectEvent() {
            String event = "시간 만료";
            // System.out.println("TimeMonitor : " + event);
            notifyObserver(event);
        }
    }

    public class LocationMonitor extends Monitor {
        @Override
        public void detectEvent() {
            String event = "장소 도착";
            // System.out.println("TimeMonitor : " + event);
            notifyObserver(event);
        }
    }

    public class ActMonitor extends Monitor {
        @Override
        public void detectEvent() {
            String event = "행동 감지";
            // System.out.println("TimeMonitor : " + event);
            notifyObserver(event);
        }
    }
}
