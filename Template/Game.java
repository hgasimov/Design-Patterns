package Template;


public abstract class Game {
    abstract void init();
    abstract void startPlay();
    abstract void endPlay();
    
    // template method
    public final void play() {
        init();
        startPlay();
        endPlay();        
    }
}
