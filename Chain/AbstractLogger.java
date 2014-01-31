package Chain;


public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    
    protected int level;
    
    protected AbstractLogger nextLogger;
    
    
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    
    public void log(int level, String message) {
        if (level >= this.level) 
            write(message);      
        
        if (this.nextLogger != null) 
            nextLogger.log(level, message);
    }
    
    abstract protected void write(String message);    
}
