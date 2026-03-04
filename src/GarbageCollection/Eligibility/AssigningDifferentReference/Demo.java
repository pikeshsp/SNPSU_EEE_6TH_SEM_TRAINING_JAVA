package GarbageCollection.Eligibility.AssigningDifferentReference;

public class Demo {
    static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1 = obj2;
    }
}