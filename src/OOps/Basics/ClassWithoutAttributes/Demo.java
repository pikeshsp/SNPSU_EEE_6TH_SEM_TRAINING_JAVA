package OOps.Basics.ClassWithoutAttributes;

public class Demo { // Class
    void printDemo(){ // method
        System.out.println("Demo");
    }
}
class DriverCode{
    public static void main(String[] args) {
        Demo obj = new Demo(); //object creation
        obj.printDemo();
    }
}
