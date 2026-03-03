package OOps.Basics.Encapsulation;

public class Student {
        private String name; //instance variable
        private int usn; //instance variable
        static String college; //class variable

        Student(String n ,int u){ // parameterized constructor
            this.name = n;
            this.usn = u;
            college = "Sapthigiri";
        }
        //Getter() --> name (private)
    String getName() {
        return name;
    }
    //Getter() --> usn(private)
    int getUsn() {
         return usn;
    }
    // setter()-->name
    void setname(String n){
        name = n;
    }
    //Setter() --> usn
    void setusn(int u){
            this.usn = u;
    }
    void printdetails(){
            System.out.println("Student name is : " + name);
            System.out.println("Student usn is : " + usn);
            System.out.println("college name is :" + college);
        }
    }
    class Driver{
        static void main(String[] args) {
            Student s1 = new Student ("pks",86);
            Student s2 = new Student("sana",99);
            s1.printdetails();
            s2.printdetails();

            s1.setname("abc");
            s1.setusn(123);

            System.out.println(s1.getName());

            s1.printdetails();
        }
    }

