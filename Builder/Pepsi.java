package Builder;


public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 1.5f;
    }
    
}
