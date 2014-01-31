package Observer;

import java.util.ArrayList;
import java.util.List;


public class Subject {
    List<Observer> observerList = new ArrayList<Observer>();
    private int state;
    
    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer obs : observerList)
            obs.update();
    }
    
    public void attachObserver(Observer obs) {
        observerList.add(obs);
    }
}
