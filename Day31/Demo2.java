import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        // Collection<Integer> c = new HashSet<Integer>();
        c.add(10);
        c.add(20);
        c.add(30);

        int n = c.size();
        System.out.println(n);

        System.out.println(c.isEmpty());

        System.out.println(c.contains(12));

        Object[] arr = (Object[]) c.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

        // T[] toArray()
        Integer[] arr2 = c.toArray(new Integer[0]);

        for (Integer i : arr2) {
            System.out.println(i);
        }

        System.out.println("-------------------");

        boolean b = c.add(10);
        c.add(10);
        System.out.println(b); // ? false because HashSet does not allow duplicate elements

        System.out.println("-------------------");
        
        boolean b2 = c.remove(10);
        System.out.println(b2);
        
        System.out.println(c.contains(10));

        System.out.println("-------------------");
        
        //? addAll(Collection<? extends E> c)
        c.addAll(List.of(5, 6, 7));
        System.out.println(c);
        
        System.out.println("-------------------");
        
        //? containsAll(Collection<?> c)
        boolean b3 = c.containsAll(List.of(5, 6));
        System.out.println(b3);
        
        System.out.println("-------------------");
        
        //? removeAll(Collection<?> c)
        // c.removeAll(List.of(5, 6));
        System.out.println(c);
        
        System.out.println("-------------------");
        
        //? retainAll(Collection<?> c)
        c.retainAll(List.of(5, 6));
        System.out.println(c); //? [5, 6] because retainAll will keep only the elements that are present in the specified collection
        
        System.out.println("-------------------");

        c.clear();
        System.out.println(c.isEmpty());

    }
}
