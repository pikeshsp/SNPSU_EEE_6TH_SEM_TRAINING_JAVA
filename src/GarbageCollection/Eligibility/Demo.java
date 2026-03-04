package GarbageCollection.Eligibility;

public class Demo {
    //This finalized function will only get called when System.gc() is called
    //But that too  it depends on JVM when to collect  garbage and when to leave
    //So we can't predict that how many times the garbage is collected

    public void finalize(){
        System.out.println("Garbage Collected ! ");

    }
    static void main(String[] args) {
        for (int i=0 ; i<=1000 ; i++){
            Demo obj = new Demo();
            obj = null;
        }
        System.gc(); //Call Garbage Collector
    }
}
