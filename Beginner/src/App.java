import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // First reverse a string 
        /*
        ReversedString stringObject = new ReversedString();
        stringObject.getString();
        System.out.println(stringObject.reversed1());
        System.out.println(stringObject.reversed2()); */
        
        // Binary Search in an Array of integer items
        /*
        BinarySearchAndRotateArray arrObject = new BinarySearchAndRotateArray();
        int [] arr = {1,2,3,4,5,7,9,11};        
        arrObject.printArray(arr);
        if (arrObject.divideAndConquer(arr, 1)){
            System.out.println("Found Item");
        }
        else{
            System.out.println("Not Found Item");
        }        
        arrObject.rotateArray(arr);
        arrObject.printArray(arr);*/

        //Matching Parentheses
        /*MatchingParentheses match = new MatchingParentheses();
        match.hasMatchParentheses("((algorithm()))");
        match.hasMatchParentheses("(()algorithm())");
        match.hasMatchParentheses(")(algorithm()))");
        match.hasMatchParentheses("((algorithm)()))");*/

        // Detect Cyclic Linked List
        
        
        
        CustomLinkedList linkedlist = new CustomLinkedList();
        linkedlist.addFirst(new Node(0));
        linkedlist.addFirst(new Node(1));
        linkedlist.addLast(new Node(2));
        linkedlist.addLast(new Node(1));
        linkedlist.displayCustomLinkedList();
        

        
        

        
        
        
    }
}
