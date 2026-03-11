package Recursion;

public class RecDemo1 {
    static void function(int x) {
        if (x < 5) {

            System.out.println("Hello");
            function(x+1);
        }
    }
    static void main(String[] args) {
        function(0);
    }
}
