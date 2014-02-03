package FrontController;


public class FrontController {
    private Dispatcher dispatcher = new Dispatcher();
    
    private boolean isAuthenticUser() {
        System.out.println("User authentication successful");
        return true;
    }
    
    private void trackRequest(String request) {
        System.out.println("Incoming request: " + request);
    }
    
    public void dispatchRequest(String request) {
        trackRequest(request);
        
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
            System.out.println("");
        }
    }
}
