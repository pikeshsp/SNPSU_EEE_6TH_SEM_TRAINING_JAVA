package Array;

import java.util.Arrays;

public class SumoftheElements {
    static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        int sum = 0;

        System.out.print("value : ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
            System.out.print("summ of element value is : " + sum);

    }
}

