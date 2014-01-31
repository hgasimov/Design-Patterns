package Chain;


public class ChainPattern {
    private static AbstractLogger getChainofLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        
        return errorLogger;
    }
    
    public static void main(String[] args) {
        AbstractLogger logger = getChainofLoggers();
        
        logger.log(AbstractLogger.INFO, "Info message");
        logger.log(AbstractLogger.DEBUG, "Debug message");
        logger.log(AbstractLogger.ERROR, "Error message");
    }
    
    private static void printArray(int[] a) { for (int i: a) println(i); }    
    private static void println(Object o) { System.out.println(o);}
}
