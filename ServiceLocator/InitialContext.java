package ServiceLocator;


public class InitialContext {
    public Service lookup(String jndiName) {
        System.out.println("Looking up for a service " + jndiName + " in the initial context");
        
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Creating a new service of type SERVICE1");
            return new Service1();
        }
        else {
            System.out.println("Creating a new service of type SERVICE2");
            return new Service2();
        }                
    }
}
