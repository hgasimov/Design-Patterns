package Observer;

public class BinaryObserver extends Observer{
    private Subject subject;
    
    public BinaryObserver(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void update() {
        System.out.println("Binary String: " 
            + Integer.toBinaryString(subject.getState())); 
    }    
}
