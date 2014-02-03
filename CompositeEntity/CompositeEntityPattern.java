    package CompositeEntity;


public class CompositeEntityPattern {
    public static void main(String[] args) {
        Client client = new Client();
        
        client.setData("Swimmer", "Phelps");
        client.printData();
        
        client.setData("Footballer", "Cristiano");
        client.printData();
    }        
}
