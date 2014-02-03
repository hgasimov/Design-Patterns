package Strategy;


public class StrategyPattern {
    public static void main(String[] args) {        
        Context context1 = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context1.execStrategy(10, 5));
        
        Context context2 = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context2.execStrategy(10, 5));
    }        
}
