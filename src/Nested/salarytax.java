package Nested;

import java.util.Scanner;

public class salarytax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary :");
        double sal = sc.nextDouble();
        double tax = 0;
        double netsalary;
        if (sal < 300000) {
            System.out.println("No Tax");
        } else {
            if (sal < 700000) {
                tax = sal * 0.10; // 10% tax
            } else {
                tax = sal * 0.20; // 20% tax
            }
        }
        netsalary = sal - tax;
        System.out.println("Tax amount" + tax);
        System.out.println("Net salary" + netsalary);
    }
}
