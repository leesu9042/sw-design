package Actuator;

public class AlramAction implements ActionObserver  {
    public void update(String event) {


        System.out.println("Alram action " + event + "를 받았습니다" );
        System.out.println("Alram Action 실행 " );
        System.out.println();


    }

    public String toString() { return "ObserverB"; }
}
