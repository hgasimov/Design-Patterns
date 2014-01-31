package Iterator;


public class IteratorPattern {
    public static void main(String[] args) {
        NameRepository nr = new NameRepository();
        
        Iterator itr = nr.iterator();
        while (itr.hasNext()) 
            System.out.println(itr.next());
    }
}
