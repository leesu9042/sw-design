package processor;

public interface ProcessorObserver {

    void update(String event);  // Observer 패턴에서 이벤트를 처리
}
