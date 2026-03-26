public class Demo4 {
    public static void main(String[] args) {
        Pair<Integer, Integer> p = new Pair<Integer, Integer>(10, 20);
        System.out.println(p.first + " " + p.second);

        Pair<String, Integer> p1 = new Pair<String, Integer>("Akkal", 21);
        System.out.println(p1.first + " " + p1.second);
    }
}

class Pair <T, U>{
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}