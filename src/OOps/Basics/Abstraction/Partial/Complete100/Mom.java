package OOps.Basics.Abstraction.Partial.Complete100;

interface Mom {
    void cook();
}
interface Dad {
    void cook();
}
class child implements Mom,Dad{
    @Override
    public void cook() {
        System.out.println("Indian");
    }
}
class hse {
    static void main(String[] args) {
        child C = new child();
        C.cook();
    }
}
