package OOps.Basics.Abstraction.Partial;

abstract class RBI {
    abstract int ROI();
}
class HDFC extends RBI{
    int ROI(){
        return 10;
    }
}
class SBI extends RBI{
    int ROI(){
        return 6;
    }
}
class Drivers2{
    static void main(String[] args) {
        HDFC b1 = new HDFC();
        SBI a1 = new SBI();
        System.out.println(b1.ROI());
        System.out.println(a1.ROI());
    }
}
