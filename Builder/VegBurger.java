package Builder;


public class VegBurger extends Burger {

    @Override
    public float price() {
        return 3.50f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }    
}
