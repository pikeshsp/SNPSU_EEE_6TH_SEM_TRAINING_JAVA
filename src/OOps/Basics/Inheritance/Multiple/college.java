package OOps.Basics.Inheritance.Multiple;

public class college { //Parent class
    void Department(){
        System.out.println("EEE");
    }
}
class Student extends college{ //children class
    void nameusn(){
        System.out.println("pikesh");
    }
}
class classroom extends Student{ //Grand children class
    void roomno(){
        System.out.println("ALH-405");
    }
}
class Driver{
    static void main(String[] args) {
        college a = new college();
                a.Department();
        Student s = new Student();
        s.nameusn();
        s.Department();
        classroom c=new classroom();
        c.roomno();
        c.nameusn();
        c.Department();
    }
}
//we can access the data from above class in this multiple inhertance
//from nitin ramesh to nitin ramesh children to ,nitin ramesh children to nitin ramesh to grand children

