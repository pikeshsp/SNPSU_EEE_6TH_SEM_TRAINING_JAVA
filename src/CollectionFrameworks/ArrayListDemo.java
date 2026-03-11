package CollectionFrameworks;

import java.util.ArrayList;

public class ArrayListDemo {
    static void main(String[] args) {
        // <> Diamond data Type
        ArrayList<Integer> list = new ArrayList<>();

        //add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20); //List allow dublicates
        System.out.println("Array list is : "+ list);

        //get()
        System.out.println("Element at index 1 is : " + list.get(1));

        //Size
        System.out.println("Size  : " + list.size());

        //Contains()
        System.out.println("contain 30 ? : " + list.contains(30));

        //Remove()
        list.remove(2);
        System.out.println("After Removing index 2 : " + list);
    }
}

/**
 * Maintains the insertion Order
 * Allows Duplicates
 * Dynamic In Size
 * indx based access
 * reading elements is faster
 */
