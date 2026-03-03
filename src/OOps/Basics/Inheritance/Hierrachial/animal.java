package OOps.Basics.Inheritance.Hierrachial;

public class animal {
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends animal {
    void bark(){
        System.out.println("Barkin..");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("Meow..");
    }
}
class Driver{
    static void main(String[] args) {
        animal a = new animal();
        a.eat();
        Dog D = new Dog();
        D.bark();
        D.eat();
        cat c = new cat();
        c.meow();
        c.eat();
    }
}
