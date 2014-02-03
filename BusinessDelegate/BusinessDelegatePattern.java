package BusinessDelegate;


public class BusinessDelegatePattern {
    public static void main(String[] args) {
        BusinessDelegate bDelegate = new BusinessDelegate();
        Client client = new Client(bDelegate);
        
        bDelegate.setService("EJB");
        client.doTask();
        
        bDelegate.setService("JMS");
        client.doTask();
    }
}
