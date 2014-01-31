package Memento;

import java.util.ArrayList;
import java.util.List;


public class CareTaker {
    List<Memento> memList = new ArrayList<Memento>();
    
    public void add(Memento mem) {
        memList.add(mem);
    }
    
    public Memento get(int i) {
        return memList.get(i);
    }
}
