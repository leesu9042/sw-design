package Actuator;

public class CallEmergency implements ActionObserver  {
    public void update(String event) {

        System.out.println(event + "를 받았습니다" );
        System.out.println("CallEmergency  실행  " );
        System.out.println();
    }

    public String toString() { return "ObserverA"; }
}
