package Mediator;


public class MediatorPattern {
    public static void main(String[] args) {
        User smith = new User("Smith");
        User john = new User("John");
        
        smith.sendMessage("Hello, John.");
        john.sendMessage("Hello, Smith. What's up?");
    }    
}
