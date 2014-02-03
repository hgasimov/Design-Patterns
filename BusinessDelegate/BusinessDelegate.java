package BusinessDelegate;


public class BusinessDelegate {
    private BusinessLookUp lookup = new BusinessLookUp();
    private String serviceType;
    
    public void setService(String serviceType) {
        this.serviceType = serviceType;
    }
    
    public void doTask() {        
        lookup.getBusinessService(serviceType).doProcessing();
    }
}
