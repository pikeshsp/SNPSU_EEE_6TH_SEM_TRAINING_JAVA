package OOps.Basics.Polymorphism.CompileTime;

public class Addition {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
    return a +b +c +d;
}
}
class sana{
    static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(5,6,9));
        System.out.println(obj.add(4,7,9,6));
    }
}
