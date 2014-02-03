package Template;


public class Football extends Game {

    @Override
    void init() {
        System.out.println("Initializing football");
    }

    @Override
    void startPlay() {
        System.out.println("Starting to play football");
    }

    @Override
    void endPlay() {
        System.out.println("Finishing playing football");
    }
    
}