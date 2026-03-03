package elseif;

import java.util.Scanner;

public class largesofthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number a :");
        System.out.println("Enter a first number b :");
        System.out.println("Enter a first number c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b >c && b>a ) {
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }
    }
}
