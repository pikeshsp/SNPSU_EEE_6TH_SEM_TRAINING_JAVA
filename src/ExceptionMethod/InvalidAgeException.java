package ExceptionMethod;

import java.util.Scanner;

//Custom runtimeException
public class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String msg){//Constactor
    super(msg);
    }
}
class pks{
    static void checkAge(int age){
        if (age<18){
            throw new InvalidAgeException("Age must be over 18 ");
            //throwing a new custom runtime exception
        }
        System.out.println("You are Eligible");
    }

    static void main(String[] args) {
        checkAge(50);
    }
}
