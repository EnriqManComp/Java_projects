import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearchAndRotateArray {

    private boolean found = false;

    public void printArray(int [] arr){
        /*
         * Print Array Method
         */
        /*
        // Method 1
        System.out.print("[ ");
        for(int i = 0; i <= arr.length-2; i++){
            System.out.print(arr[i] + ", ");            
        }
        System.out.println(arr[arr.length-1] + " ]"); */
        // Stream Method
        System.out.print("[ ");
        Arrays.stream(arr).forEach(item -> System.out.print(" " + item + " "));
        System.out.println(" ]");
        
    }

    public boolean divideAndConquer(int [] arr, int itemToSearch){        
        /*
         * Recursive Binary Search
         * Assumption: Array is sorted in ascending order
         */
        int halfDim = (int) (arr.length/2);        
        if(arr.length == 0){
            return found;
        }
        else{
            if(arr[halfDim] == itemToSearch){                              
                found = true;                
            }        
            else{
                if(arr[halfDim] < itemToSearch){                
                    int [] arrRight = Arrays.copyOfRange(arr, halfDim+1, arr.length);
                    divideAndConquer(arrRight, itemToSearch);                    
                }
                else{
                    int [] arrLeft = Arrays.copyOfRange(arr, 0, halfDim);
                    divideAndConquer(arrLeft, itemToSearch);
                }               
                
            }    
        }
        return found;       
    }
   
    public void rotateArray(int [] arr){
        /*
         * Rotate IN PLACE one position to the left each item 
         */
        
        int firstItem = arr[0];
        // Create a flow of indices of the array
        IntStream indices = IntStream.range(0, arr.length-1);        
        indices.forEach(index -> arr[index] = arr[index+1]);
        arr[arr.length-1] = firstItem;

    }   
}
