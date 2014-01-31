package Observer;


public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attachObserver(new BinaryObserver(subject));
        subject.attachObserver(new OctalObserver(subject));
                
        System.out.println("State change to " + 10);
        subject.setState(10);
        System.out.println("State change to " + 20);
        subject.setState(20); 
    }    
}
