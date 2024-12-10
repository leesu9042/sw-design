package Actuator;

public class ConcreteAction implements Action {
    private String name;

    public ConcreteAction(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {

    }
}
