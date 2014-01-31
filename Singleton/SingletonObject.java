package Singleton;


public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();
    
    // make the constructor private
    private SingletonObject(){}
    
    private static SingletonObject getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Hey, I'm a singleton object!");
    }
    
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        
        SingletonObject so = SingletonObject.getInstance();
        so.showMessage();
    }        
}
