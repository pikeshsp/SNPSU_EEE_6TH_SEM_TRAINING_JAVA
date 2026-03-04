package ExceptionMethod;

import java.util.Scanner;

public class E3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Balance : ");
        int balance = sc.nextInt();
        System.out.print("Withdraw : ");
        int withdraw = sc.nextInt();
        if (withdraw > balance) {
            throw new ArithmeticException(" Insufficient Balance ");
        }
        System.out.println("withdraw Successful ");
        }
    }


