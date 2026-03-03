package Strings;

public class StringDemo {
    static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        String s3= new String("Hello");
        System.out.println(s1==s2 && s2==s3);
    }
}
