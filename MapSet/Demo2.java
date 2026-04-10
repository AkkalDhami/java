import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        // Set<Integer> set2 = new TreeSet<Integer>(List.of(5, 3, 8, 1, 4));
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(1);
        set.add(4);
        System.out.println(set);

        System.out.println("---------------");
        
        //? SortedSet Interface
        System.out.println(set.first()); //? 1
        System.out.println(set.last()); //? 8
        System.out.println(set.headSet(4)); //? [1, 3]
        System.out.println(set.tailSet(4)); //? [4, 5, 8]

        System.out.println(set.subSet(1, 3)); //? from(inclusive) to(exclusive) => [1, 3) => [1]

        System.out.println("---------------");
        System.out.println(set);

        //? NavigableSet Interface
        System.out.println(set.lower(4)); //? 3 => greatest element less than 4
        System.out.println(set.floor(4)); //? 4 => greatest element less than or equal to 4
        System.out.println(set.higher(4)); //? 5 => least element greater than 4
        System.out.println(set.ceiling(4)); //? 5 => least element greater than or equal to 4

        System.out.println("---------------");

        System.out.println(set.pollFirst()); //? 1 => retrieves and removes the first (lowest) element
        System.out.println(set.pollLast()); //? 8 => retrieves and removes the last (highest) element

        System.out.println(set.descendingSet());

        Iterator<Integer> it = set.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---------------");


        System.out.println(set.headSet(4, true));
        System.out.println(set.tailSet(4, true));

        System.out.println(set.subSet(1, true, 5, false));

        System.out.println("---------------");
        System.out.println(set);
    }
}

//? BST => left < root < right -> O(log n)