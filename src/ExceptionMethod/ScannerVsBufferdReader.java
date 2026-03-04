package ExceptionMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerVsBufferdReader {
    static void main(String[] args) throws IOException {
        String name ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name : ");
        name = br.readLine();
        System.out.println("You entered : " + name);
    }
}
