import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> m1 = new TreeMap<>();

        m1.put("A", 1);
        m1.put("B", 2);
        m1.put("C", 3);
        System.out.println(m1);

        System.out.println("------------------");

        System.out.println(m1.firstKey());
        System.out.println(m1.firstEntry());
        System.out.println(m1.lastKey());
        System.out.println(m1.lastEntry());

        // ? NavigableMap
        System.out.println("------------------");
        System.out.println(m1.headMap("C"));
        System.out.println(m1.tailMap("B"));

        System.out.println("------------------");
        System.out.println(m1.subMap("A", "C"));

        // ? SortedMap
        System.out.println("------------------");
        System.out.println(m1.lowerKey("C"));
        System.out.println(m1.lowerEntry("C"));
        System.out.println(m1.floorKey("C"));
        System.out.println(m1.higherKey("C"));
        System.out.println(m1.ceilingKey("C"));

        System.out.println("------------------");
        System.out.println(m1.pollFirstEntry());
        System.out.println(m1.pollLastEntry());

        System.out.println("------------------");
        System.out.println(m1.descendingMap());
        System.out.println(m1.descendingKeySet());

        System.out.println("------------------");

    }
}
