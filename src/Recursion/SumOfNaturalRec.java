package Recursion;

import java.util.Arrays;

public class SumOfNaturalRec {
    static int sum( int x){
        if(x==1){ //base case
            return 1;
        }else{
            return x+sum(x-1); //recursive case
        }
    }

    static void main(String[] args) {
        int num = 1000;
        int result = sum(num);
        System.out.println(result);
    }
}
