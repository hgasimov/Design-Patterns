package Memento;


public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator org = new Originator();
        CareTaker careTaker = new CareTaker();
        
        org.setState("State #1");
        org.setState("State #2");        
        careTaker.add(org.saveToMemento());
        org.setState("State #3");
        org.setState("State #4");
        careTaker.add(org.saveToMemento());
        org.setState("State #5");
                
        System.out.println("Current state - " + org.getState());
        System.out.println("First save state - " + careTaker.get(0).getState());
        System.out.println("Second save state - " + careTaker.get(1).getState());        
    }        
}
