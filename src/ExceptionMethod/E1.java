package ExceptionMethod;

public class E1 {
    static void main(String[] args) {
        int i=10 , j=2 , k=0;
        try{
            k = i/j;
            int[] arr ={1,2,3,4,5};
            System.out.println(arr[20]);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide anything by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch (Exception e){
            System.out.println("Unknown Exception");
        }
        finally {
            System.out.println("This block will get executed ");
        }
        System.out.println("hello");
    }
}
