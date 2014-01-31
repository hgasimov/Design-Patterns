package Iterator;



public class NameRepository implements Iterable {
    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }
    
    private class NameIterator implements Iterator {
        private int i = 0;
        
        @Override
        public boolean hasNext() {
            return i < names.length;
        }

        @Override
        public Object next() {
            if (!hasNext()) return false;
            return names[i++];
        }
        
    }
}
