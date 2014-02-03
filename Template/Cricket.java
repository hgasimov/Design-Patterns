package Template;


public class Cricket extends Game {

    @Override
    void init() {
        System.out.println("Initializing cricket");
    }

    @Override
    void startPlay() {
        System.out.println("Starting to play cricket");
    }

    @Override
    void endPlay() {
        System.out.println("Finishing playing cricket");
    }
    
}
