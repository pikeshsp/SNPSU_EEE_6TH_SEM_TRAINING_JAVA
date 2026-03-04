package Array;

public class Demo1 {
    static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; //-> 1,2,3,4,5
        int[] arr2 = new int[5]; //-> 0,0,0,0,0

        System.out.println(arr1[2]);//->3

        //System.out.println(arr1); //Wrong way

        //Print arr1
        for (int i = 0; i <arr1.length; i++) {
            System.out.print(arr1[i] + " "); //1,2,3,4,5
        }
        System.out.println();

        //Print arr2
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

}
