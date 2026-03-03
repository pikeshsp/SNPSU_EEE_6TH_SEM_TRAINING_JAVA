package OOps.Basics.Inheritance.ClassWithConstractor;

public class Person {
    String Firstname;
    String Lastname;

    Person(String Firstname,String Lastname){
     this.Firstname=Firstname;
     this.Lastname=Lastname;

    }
}
class Student extends Person{
    int usn;

    Student(String Firstname,String Lastname,int usn){
        super(Firstname,Lastname);
        this.usn = usn;
    }
    void printDetails(){
        System.out.println("Person Firstname : " + Firstname);
        System.out.println("Lastname : " + Lastname);
        System.out.println("Student : " + usn );
    }
}
class pks{
    static void main(String[] args) {
        Student s1 = new Student("pks","sana",86);
        s1.printDetails();
    }
}

