import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        
        NameContainer names = new NameContainer(new String[]{"A", "B", "C"});
        for (String name : names) {
            System.out.println(name);
        }
    }
}

class NameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    public NameContainer(String[] names) {
        this.names = names;
        this.size = names.length;
    }
    
    @Override
    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < size;
        }
        @Override
        public String next() {
            return names[index++];
        }
    }
}