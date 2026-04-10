import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        // ? TreeMap => sorted by keys
        Map<String, Integer> map = new TreeMap<>();
        map.put("Akkal", 30);
        map.put("Aavash", 25);
        map.put("Akkal", 35);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println("-----------------");

        System.out.println(map.containsKey("Aavash")); // : true
        System.out.println(map.containsValue(30)); // : false
        System.out.println(map.get("Akkal")); // : 35
        System.out.println(map.put("hello", 12));

        System.out.println("-----------------");
        System.out.println(map);

        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("X", 100);
        map2.put("Y", 200);

        map.putAll(map2);

        System.out.println(map);

        map.remove("X");
        System.out.println(map);
        map2.clear();
        System.out.println(map2);

        System.out.println("-----------------");
        
        Set<String> keys = map.keySet();
        System.out.println(keys);
        
        Collection<Integer> values = map.values();
        System.out.println(values);
        
        System.out.println("-----------------");
        
        Map<String, Integer> map3 = new TreeMap<>();
        map3.put("A", 1);
        map3.put("B", 2);
        map3.put("A", 3);
        
        Set<Map.Entry<String, Integer>> entries = map3.entrySet();
        System.out.println(entries); //? [A=3, B=2]
        
        System.out.println(map2.getOrDefault("C", 2));

        System.out.println("-----------------");

        System.out.println(map3.putIfAbsent("D", 123));
        map3.remove("A", 4);
        System.out.println(map3);

        map3.replace("B", 200);  //? replace-> update only if key is present
        System.out.println(map3);

        System.out.println("-----------------");

        Set<Map.Entry<String, Integer>> entries2 = map3.entrySet();

        for (Map.Entry<String, Integer> entry : entries2) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-----------------");
        Map<String, Integer> map4 = Map.of("A", 1, "B", 2, "C", 3); //? immutable map
        System.out.println(map4);
    }
}

/**
 * Map
 * / \
 * HashMap TreeMap
 * |
 * LinkedHashMap
 */