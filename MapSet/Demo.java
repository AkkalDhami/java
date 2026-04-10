import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Hello");

        System.out.println(set);
        System.out.println(set.contains("Hello"));

        Map<String, Integer> map = new HashMap<>();
        map.put("Akkal", 30);
        map.put("Aavash", 25);
        map.put("Akkal", 35);

        System.out.println(map);
        System.out.println(map.get("Akkal"));
        System.out.println(map.containsKey("Aavash"));
    }
}
