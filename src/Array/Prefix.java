package Array;

public class Prefix {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

//Building the array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.print("Prefix sum array : ");

        //Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();


        //Prefix Range
        int L=1;
        int R=3;

        int sum;
        sum = prefix[R] - prefix[L-1];

        System.out.println("Sum of range from index 1 to 3 : " + sum);
    }
}
