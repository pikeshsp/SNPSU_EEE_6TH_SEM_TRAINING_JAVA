package Array;

public class HighestNumber {
    static void main(String[] args) {
        int[] arr = {86, 83 , 97 , 73 , 88};
        int max = arr[0] ;

        System.out.print("Values : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Maximum of the element is : " + max);
    }
}
