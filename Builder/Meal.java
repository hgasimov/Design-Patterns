package Builder;

import java.util.ArrayList;
import java.util.List;


public class Meal {
    private List<Item> items = new ArrayList<Item>();
    private float totalCost = 0.0f;
    
    public void addItem(Item item) {
        items.add(item);
        totalCost += item.price();
    }
    
    public float getCost() {
        return totalCost;
    }
    
    public void showItems() {
        System.out.println("Name\t\tPacking\t\tPrice");
        
        for (Item item : items) {            
            System.out.println(item.name() +  "\t" + item.packing().pack() + "\t\t" + item.price());
        }
        
        System.out.println("Total:\t\t\t\t" + getCost());
    }
}
