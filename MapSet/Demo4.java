import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Map<String, Integer> map2 = new LinkedHashMap<>(100);

        Map<String, Integer> map3 = new HashMap<>(100, 0.3f);

        Map<String, Integer> map4 = new HashMap<>(map3);

        map2.put("Aavash", 25);
        map4.put("Akkal", 30);

        map.put("Akkal", 30);
        map.put("Aavash", 25);
        map.put("Akkal", 35);


        System.out.println(map);
    }
}
