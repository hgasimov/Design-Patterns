package BusinessDelegate;


public class EJBService implements BusinessService{

    @Override
    public void doProcessing() {
        System.out.println("Processing using an EJB service");
    }
        
}
