package BusinessDelegate;


public class Client {
    private BusinessDelegate bDelegate;
    
    public Client(BusinessDelegate bDelegate) {
        this.bDelegate = bDelegate;
    }
    
    public void doTask() {
        bDelegate.doTask();
    }
            
}
