package OOps.Basics.Inheritance.Multiple;

public class mom {
    void cook(){
        System.out.println("Cooking..");
    }
}
class Dad {
    void sleep(){
        System.out.println("Sleeping..");
    }
}
class Child extends mom{
    void Study(){
        System.out.println("Studying..");
    }
}
class pks{
    static void main(String[] args) {
    mom M = new mom();
    M.cook();
    Dad D = new Dad();
    D.sleep();
    Child C = new Child();
    C.Study();
    C.cook();
    }
}