package OOps.Basics.Inheritance.Single;

public class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barkin..");
    }
}
class Driver{
    static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
