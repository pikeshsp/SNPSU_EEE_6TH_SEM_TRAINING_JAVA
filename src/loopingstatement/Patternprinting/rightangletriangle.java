package loopingstatement.Patternprinting;

import java.util.Arrays;

public class rightangletriangle {
    static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
