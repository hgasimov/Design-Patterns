package state;


public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("This is Stop State");
        context.setState(this);
    }
    
    @Override
    public String toString() {
        return "Stop State";
    }
}
