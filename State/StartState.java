package state;


public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("This is Start State");
        context.setState(this);
    }
    
    @Override
    public String toString() {
        return "Start State";
    }
}
