package Array;

public class MissingArray {
    static void main(String[] args) {
        int[]arr = { 1,2,4,5};
        int n =5 ;

        int total_sum = n*(n+1)/2;

        int actual_sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            actual_sum += arr[i];
        }
        System.out.println("Missing number is : " + (total_sum - actual_sum));
    }
}
