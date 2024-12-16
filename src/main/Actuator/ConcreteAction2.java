package Actuator;



interface ActionObserver  {
    void update();
}

class ObserverA implements ActionObserver  {
    public void update() {
        System.out.println("ObserverA 한테 이벤트 알림이 왔습니다.");
    }

    public String toString() { return "ObserverA"; }
}




class ObserverB implements ActionObserver  {
    public void update() {
        System.out.println("ObserverB 한테 이벤트 알림이 왔습니다.");
    }

    public String toString() { return "ObserverB"; }
}
