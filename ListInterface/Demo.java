import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        // list.set(0, "Akkal");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // list.remove(0);
        System.out.println(list);
        System.out.println("------------");

        System.out.println(list.indexOf("!"));

        System.out.println("------------");

        System.out.println(list.lastIndexOf("World"));

        System.out.println("------------");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println("------------");

        // while (iterator.hasPrevious()) {
        // System.out.println(iterator.previousIndex());
        // iterator.previous();
        // }

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(nums);

        System.out.println("------------");

        // nums.add(12); //! UnsupportedOperationException

        List<Integer> n2 = List.copyOf(nums);
        System.out.println(n2);
    }
}
