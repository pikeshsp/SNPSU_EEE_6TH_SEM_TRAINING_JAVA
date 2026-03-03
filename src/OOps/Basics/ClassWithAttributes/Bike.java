package OOps.Basics.ClassWithAttributes;

public class Bike {
    String model;
    String colour;
    int Price;

    Bike(String M , String C , int P) //parameterized constractor
    {
        this.model = M;
        this.colour = C;
        this.Price = P;
    }
    void printdetails(){
        System.out.println("Bike model : " + model);
        System.out.println("Bike colour : " + colour);
        System.out.println("Bike price : " + Price);
    }
}
class driver {
    static void main(String[] args) {
        Bike n1 = new Bike("fz","blue",180000);
        Bike n2 = new Bike("yahama", "black",890000);
    n1.printdetails();
    n2.printdetails();
    }
}
