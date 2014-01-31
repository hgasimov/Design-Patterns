package Observer;


public class OctalObserver extends Observer {
    private Subject subject;
    
    public OctalObserver(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void update() {
        System.out.println("Octal String: " 
            + Integer.toOctalString(subject.getState())); 
    }        
}
