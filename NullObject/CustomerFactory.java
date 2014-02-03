package NullObject;


public class CustomerFactory {
    private static final String[] names = {"Rob", "Joe", "Julie"};
    
    public static AbstractCustomer getCustomer(String customerName) {
        for (String name : names)
            if (name.equalsIgnoreCase(customerName))
                return new RealCustomer(name);
        
        return new NullCustomer();
    }     
}
