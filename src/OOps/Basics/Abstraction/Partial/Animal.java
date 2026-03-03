package OOps.Basics.Abstraction.Partial;

abstract class Animal {
    abstract void eat();

    void run(){
        System.out.println("Running...");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("Meat");
    }
}
class Dear extends Animal{
    @Override
    void eat() {
        System.out.println("Grass");
    }
}
class sana{
    static void main(String[] args) {
}
}
