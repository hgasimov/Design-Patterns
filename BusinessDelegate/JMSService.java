package BusinessDelegate;


public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing via the JMS servise");
    }
    
}
