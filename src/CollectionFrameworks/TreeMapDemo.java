package CollectionFrameworks;

import java.util.TreeMap;

public class TreeMapDemo {
    static void main(String[] args) {
        TreeMap<Integer,String>  map = new TreeMap<>();

        map.put(3,"C");
        map.put(1,"A");
        map.put(2, "B");
        map.put(4,"D");

        System.out.println(map);

        //get()
        System.out.println(map.get(2));

        //firstkey() --> smallest key
        System.out.println(map.firstKey());

        //lastkey() --> Largest key
        System.out.println(map.lastKey());

        //remove
        map.remove(2);
        System.out.println(map);
    }
}

/**
 * Stores the element in key and value pair
 * key must be unique
 * Automatically Sorts the keys
 * uses hash internally
 * uses Trees Structure
 * Slower than HashMap
 */