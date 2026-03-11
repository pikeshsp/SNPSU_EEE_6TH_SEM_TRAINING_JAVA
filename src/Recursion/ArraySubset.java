package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArraySubset {
    static void ArraySubsets(int[] arr, int index , List<Integer> current){
        //Base Case
        if(index == arr.length){
            System.out.println(current);
            return;
        }
        //Adding the element
        current.add(arr[index]);
        ArraySubsets(arr,index+1 , current);
        //Back Tracking
        current.remove(current.size()-1);
        //Skip and Explore
        ArraySubsets(arr,index+1,current);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int index = 0;
        ArraySubsets(arr,index,new ArrayList<>());
    }
}
