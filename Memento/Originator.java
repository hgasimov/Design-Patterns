package Memento;


public class Originator {
    private String state;
    
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public Memento saveToMemento() {
        return new Memento(this.state);
    }
    
    public void getStateFromMemento(Memento mem) {
        this.state = mem.getState();
    }    
}
