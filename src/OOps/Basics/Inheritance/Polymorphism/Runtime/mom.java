package OOps.Basics.Inheritance.Polymorphism.Runtime;

public class mom {
    void cook(){
        System.out.println("Indian");
    }
}
class Daughter extends mom{
    @Override
    void cook() {
        System.out.println("Bengali");
    }
}
class Sana{
    static void main(String[] args) {
        mom M = new mom();
        M.cook();
        Daughter D = new Daughter();
        D.cook();
        M.cook();
    }
}
