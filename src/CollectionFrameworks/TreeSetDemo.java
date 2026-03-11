package CollectionFrameworks;

import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        //add()
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);

        //First
        System.out.println(set.first());

        //Last
        System.out.println(set.last());

        //remove()
        set.remove(30);
        System.out.println(set);
    }
}

/**
 * No duplicate are alllowed
 * Automatically sorts the elements
 * uses tree structure internally
 * slower  than hashset
 * usefull when sorted data is needed
 */