package loopingstatement.Patternprinting;

public class butterfly {
    static void main(String[] args)
    //upper part
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 2 * i; j <= 2 * 5; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //lower part
        for (int i =5-1; i>=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 2 * i; j <= 2 * 5; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


