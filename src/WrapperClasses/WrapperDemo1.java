package WrapperClasses;

//Primitive------->Object Conversion =Boxing
//Manual boxing
public class WrapperDemo1 {
    static void main(String[] args) {
        int x =10;
        Integer obj = new Integer(x);

        System.out.println("Primitive val : " + x);
        System.out.println("Object val : " + obj);
    }
}
