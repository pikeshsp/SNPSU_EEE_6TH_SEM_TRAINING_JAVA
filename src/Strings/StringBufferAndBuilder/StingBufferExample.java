package Strings.StringBufferAndBuilder;

public class StingBufferExample {
    static void stringAppend(){
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Original string is : " + sbf );
        sbf.append(" World ");
        System.out.println("New String is : " + sbf);
    }
    static void stringinsert() {
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Original string is : " + sbf);
        sbf.insert(2, "World");
        System.out.println("New String is : " + sbf);
    }
    static void stringReverse() {
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Original string is : " + sbf);
        sbf.reverse();
        System.out.println("New String is : " + sbf);
    }

    static void main(String[] args) {
        stringAppend();
        stringinsert();
        stringReverse();
    }

}
