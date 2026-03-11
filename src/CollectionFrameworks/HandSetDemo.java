package CollectionFrameworks;

import java.util.HashSet;

public class HandSetDemo {
    static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set);

        //contains
        System.out.println("Contains 20? : " + set.contains(20));

        //remove()
        set.remove(10);
        System.out.println(set);

        //size
        System.out.println(set.size());
    }
}

/**
 * it doesn't allow duplicate
 * Doesn't maintains the order of insertion
 * Uses handing internally
 * Very fast for add , remove , and searching operation
 *
 */
