package CollectionFrameworks;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    static void main(String[] args) {
        LinkedHashMap<Integer,String > map = new LinkedHashMap<>();

        //put()
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Orange");

        System.out.println(map);

        //get()
        System.out.println(map.get(2)); //Give me the value stored at 2

        //Containskey()
        System.out.println("Contain key 3? : " + map.containsKey(3));

        //remove()
        map.remove(1);
        System.out.println(map);
    }
}

/**
 * Stores the elements in key and value pair
 * key must be unique
 * does not maintains the order of insertion
 * uses hash internally
 */

