package CollectionFrameworks;

import java.util.LinkedList;

public class LinkedListDemo {
    static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //add()
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

                //addfirst()
        list.addFirst("Start");
        System.out.println(list);

        //addLast
        list.addLast("End");
        System.out.println(list);

        //get()
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //remove()
        list.removeFirst();
        System.out.println(list);
    }
}

/**
 * Maintains the insertion order
 * Allows Duplicate
 * uses node structure internally
 * Faster Insertion and Deletion Than Arraylist
 * slow reading
 */
