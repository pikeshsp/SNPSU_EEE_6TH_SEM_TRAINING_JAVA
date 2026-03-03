package Conditionalstatements;

import java.util.Scanner;

public class agevote {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age =  sc.nextInt();
        if (age >= 18 ){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }
    }
}
