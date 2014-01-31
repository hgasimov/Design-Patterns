package Builder;


public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
    
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();
        
        Meal vegMeal = mb.prepareVegMeal();
        Meal nonVegMeal = mb.prepareNonVegMeal();
        
        System.out.println(" --- Veg Meal ---");
        vegMeal.showItems();
        System.out.println("\n");
        
        System.out.println(" --- Non Veg Meal ---");
        nonVegMeal.showItems();
        System.out.println("\n");
                
    }
}
