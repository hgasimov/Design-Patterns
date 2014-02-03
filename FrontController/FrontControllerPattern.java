package FrontController;


public class FrontControllerPattern {
    public static void main(String[] args) {
        FrontController controller = new FrontController();
        
        controller.dispatchRequest("Home");
        controller.dispatchRequest("Student");
    }    
}
