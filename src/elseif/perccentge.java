package elseif;

import java.util.Scanner;

public class perccentge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P, Q, R, S, T, Totalmarks;
        double Percentage;
        System.out.println("Subject P marks :");
        P = sc.nextInt();
        System.out.println("Subject Q marks :");
        Q = sc.nextInt();
        System.out.println("Subject R marks :");
        R = sc.nextInt();
        System.out.println("Subject S marks :");
        S = sc.nextInt();
        System.out.println("Subject T marks :");
        T = sc.nextInt();

        Totalmarks = P + Q + R + S + T;
        Percentage = (Totalmarks / 500) * 100;

        if (Percentage >= 75) {
            System.out.println("A");
        } else if (Percentage >= 50) {
            System.out.println("B");
        } else {
            System.out.println("Fail");
        }
    }
}
