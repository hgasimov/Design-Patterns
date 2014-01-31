package Command;


public class CommandPattern {
    public static void main(String[] args) {
        Stock chfStock = new Stock("CHF", 10000);
        
        BuyStock buyStk = new BuyStock(chfStock);
        SellStock sellStk = new SellStock(chfStock);
        
        Broker broker = new Broker();
        broker.takeOrder(buyStk);
        broker.takeOrder(sellStk);
        broker.placeOrders();
    }    
}
