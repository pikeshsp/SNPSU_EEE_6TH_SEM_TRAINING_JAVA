package OOps.Basics.ClassWithAttributes;

import java.util.Locale;

public class Student {
    String name;
    int usn;

    Student(String name ,int usn){
        this.name = name;
        this.usn = usn;
    }
    void printdetails(){
        System.out.println("Student name is : " + name);
        System.out.println("Student usn is : " + usn);
    }
}
class Driver{
    static void main(String[] args) {
        Student s1 = new Student("pikesh",86);
        Student s2 = new Student("sana",427);
    s1.printdetails();
s2.printdetails();
}
}
