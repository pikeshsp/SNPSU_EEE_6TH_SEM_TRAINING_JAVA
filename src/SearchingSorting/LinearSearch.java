package SearchingSorting;

public class LinearSearch {
   static int LinearSearch(int key , int[]arr) {
       for (int i = 0; i < arr.length ; i++) {
        if(arr[i]==key){
            return i;
        }
       }
       return -1;
   }
    static void main(String[] args) {
        int[]arr = {10,2,7,1,18,20,11};
    int key = 30;

    int result = LinearSearch(key ,arr);
    if(result!=-1){
        System.out.println("Found the element at : " + result);
    }else{
        System.out.println("Element was not Found");
    }
   }
}
