package Strings;

public class StringImmutable {
    static void main(String[] args) {
        String s1 = "Nitin";
        s1.concat("Ramesh");
        System.out.println(s1);
    String s2 = s1 + "Ramesh";
        System.out.println(s2);
    }
}
// we can change initial String value , until and unless we create new string
